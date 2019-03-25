package org.kodein.sample.pokedex.data

import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.serialization.json.Json

expect class Context

internal expect suspend fun getPokedexJson(ctx: Context): String

class PokedexDownloader(private val context: Context) {

    private val mutex = Mutex()

    private var pokedex: Pokedex? = null

    suspend fun get(): Pokedex {
        pokedex?.let { return it }

        mutex.withLock {
            pokedex?.let { return it }
            val json = getPokedexJson(context)
            return Json.nonstrict.parse(Pokedex.serializer(), json).also { pokedex = it }
        }
    }

}
