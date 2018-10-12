package org.kodein.sample.pokedex.data

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.runBlocking
import org.kodein.di.Kodein
import org.kodein.di.erased.bind
import org.kodein.di.erased.instance
import org.kodein.sample.pokedex.businessModule
import org.kodein.sample.pokedex.pres.PokemonListMVP
import org.kodein.sample.pokedex.pres.PokemonMVP

class PokeBridge {

    val kodein = Kodein.direct {
        import(businessModule)
        bind() from instance(Context())
    }

    fun getPokedex() = runBlocking { kodein.instance<PokedexDownloader>().get() }

    fun getPokemonListPresenter(arg: PokemonListMVP.Arg): PokemonListMVP.Presenter = kodein.instance(arg = arg)
    fun getPokemonPresenter(arg: PokemonMVP.Arg): PokemonMVP.Presenter = kodein.instance(arg = arg)

}
