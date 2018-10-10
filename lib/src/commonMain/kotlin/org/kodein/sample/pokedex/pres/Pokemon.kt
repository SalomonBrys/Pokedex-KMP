package org.kodein.sample.pokedex.pres

import org.kodein.sample.pokedex.data.Pokemon

interface PokemonPresenter {
    suspend fun start()
    suspend fun pokemonSelected(num: String)
}

interface PokemonView {
    fun displayPokemon(pokemon: Pokemon)
    fun goToPokemonScreen(id: Int)
    fun close()
}

