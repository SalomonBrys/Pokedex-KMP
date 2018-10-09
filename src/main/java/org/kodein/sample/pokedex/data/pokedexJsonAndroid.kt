package org.kodein.sample.pokedex.data

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

actual class Context(val androidContext: android.content.Context)

internal actual suspend fun getPokedexJson(ctx: Context): String = GlobalScope.async {
    val id = ctx.androidContext.resources.getIdentifier("pokedex", "raw", ctx.androidContext.packageName)
    ctx.androidContext.resources.openRawResource(id).use { stream ->
        stream.readBytes().toString(Charsets.UTF_8)
    }
}.await()
