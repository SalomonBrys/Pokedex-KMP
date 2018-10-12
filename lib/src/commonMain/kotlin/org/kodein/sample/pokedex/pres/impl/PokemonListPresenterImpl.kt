package org.kodein.sample.pokedex.pres.impl

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.kodein.sample.pokedex.AppDispatcher
import org.kodein.sample.pokedex.data.PokedexDownloader
import org.kodein.sample.pokedex.data.findById
import org.kodein.sample.pokedex.pres.PokemonListMVP


internal class PokemonListPresenterImpl(private val pokedex: PokedexDownloader, arg: PokemonListMVP.Arg) : PokemonListMVP.Presenter {

    private val view = arg.view

    override fun start() {
        GlobalScope.launch(AppDispatcher) {
            view.displayList(pokedex.get().pokemons)
        }
    }

    override fun pokemonSelected(id: Int) {
        GlobalScope.launch(AppDispatcher) {
            val pokemon = pokedex.get().findById(id) ?: return@launch
            view.goToPokemonScreen(pokemon.name, id)
        }
    }

}
