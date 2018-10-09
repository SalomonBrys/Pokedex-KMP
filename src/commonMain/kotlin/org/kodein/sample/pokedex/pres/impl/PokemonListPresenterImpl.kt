package org.kodein.sample.pokedex.pres.impl

import org.kodein.sample.pokedex.data.Pokedex
import org.kodein.sample.pokedex.data.PokedexDownloader
import org.kodein.sample.pokedex.pres.PokemonListPresenter
import org.kodein.sample.pokedex.pres.PokemonListView

internal class PokemonListPresenterImpl(private val pokedex: PokedexDownloader, private val view: PokemonListView) : PokemonListPresenter {

    override suspend fun start() {
        view.displayList(pokedex.get().pokemons)
    }

    override suspend fun pokemonSelected(id: Int) {
        view.goToPokemonScreen(id)
    }

}
