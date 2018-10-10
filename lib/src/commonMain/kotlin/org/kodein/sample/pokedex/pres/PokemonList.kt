package org.kodein.sample.pokedex.pres

import org.kodein.sample.pokedex.data.Pokemon

interface PokemonListPresenter {
    suspend fun start()
    suspend fun pokemonSelected(id: Int)
}

interface PokemonListView {
    fun displayList(pokemons: List<Pokemon>)
    fun goToPokemonScreen(id: Int)
}

