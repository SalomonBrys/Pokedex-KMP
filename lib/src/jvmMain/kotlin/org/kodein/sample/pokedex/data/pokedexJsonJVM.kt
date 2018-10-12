package org.kodein.sample.pokedex.data

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

class R

actual class Context

internal actual suspend fun getPokedexJson(ctx: Context): String = GlobalScope.async {
    R::class.java.getResourceAsStream("/pokedex.json").use { stream ->
        stream.readBytes().toString(Charsets.UTF_8)
    }
}.await()
