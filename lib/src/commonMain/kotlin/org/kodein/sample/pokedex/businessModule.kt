package org.kodein.sample.pokedex

import org.kodein.di.Kodein
import org.kodein.di.erased.bind
import org.kodein.di.erased.factory
import org.kodein.di.erased.instance
import org.kodein.di.erased.singleton
import org.kodein.sample.pokedex.data.PokedexDownloader
import org.kodein.sample.pokedex.pres.*
import org.kodein.sample.pokedex.pres.impl.PokemonListPresenterImpl
import org.kodein.sample.pokedex.pres.impl.PokemonPresenterImpl

val businessModule = Kodein.Module(name = "pokedex-business") {
    bind() from singleton { PokedexDownloader(instance()) }

    bindMVP(PokemonListMVP) { PokemonListPresenterImpl(instance(), it) }
    bindMVP(PokemonMVP) { PokemonPresenterImpl(instance(), it) }
}
