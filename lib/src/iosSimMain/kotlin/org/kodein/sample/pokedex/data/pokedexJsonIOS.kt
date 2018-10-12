package org.kodein.sample.pokedex.data

import platform.Foundation.*


actual class Context

internal actual suspend fun getPokedexJson(ctx: Context): String {
    val url = NSBundle.mainBundle().URLForResource("pokedex", "json") ?: throw IllegalStateException("No Pokedex JSON file")
    return NSString.create(url)!!.toString()
}
