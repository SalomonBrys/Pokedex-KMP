package org.kodein.sample.pokedex.data

import kotlinx.io.IOException
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

external val process: dynamic

external fun require(module: String): dynamic

val fs = require("fs")

actual class Context

internal actual suspend fun getPokedexJson(ctx: Context): String = suspendCoroutine { cont ->
    val path = process.env.pokedex as? String ?: throw IllegalStateException("No pokedex environment variable")
    fs.readFile(path, "utf8") { err, data ->
        if (err != null)
            cont.resumeWithException(IOException(err.message))
        else
            cont.resume(data)
    }
    Unit
}
