package org.kodein.sample.pokedex.data

import kotlinx.coroutines.await
import kotlinx.io.IOException
import org.w3c.fetch.RequestInit
import kotlin.browser.window
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

actual class Context

internal actual suspend fun getPokedexJson(ctx: Context): String =
    window
        .fetch("pokedex.json", object : RequestInit {
            override var method: String? = "GET"
        }).await()
        .text().await()
