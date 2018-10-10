package org.kodein.sample.pokedex.pres.impl

import org.kodein.sample.pokedex.data.PokedexDownloader
import org.kodein.sample.pokedex.data.findById
import org.kodein.sample.pokedex.data.findByNum
import org.kodein.sample.pokedex.pres.PokemonPresenter
import org.kodein.sample.pokedex.pres.PokemonView

internal class PokemonPresenterImpl(private val pokedex: PokedexDownloader, private val id: Int, private val view: PokemonView) : PokemonPresenter {

    override suspend fun start() {
        val pokemon = pokedex.get().findById(id)
        if (pokemon != null)
            view.displayPokemon(pokemon)
        else
            view.close()
    }

    override suspend fun pokemonSelected(num: String) {
        val id = pokedex.get().findByNum(num)?.id ?: return
        view.goToPokemonScreen(id)
    }

}
