package org.kodein.sample.pokedex.pres.impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.kodein.sample.pokedex.AppDispatcher
import org.kodein.sample.pokedex.data.Evolutions
import org.kodein.sample.pokedex.data.PokedexDownloader
import org.kodein.sample.pokedex.data.findById
import org.kodein.sample.pokedex.data.findByNum
import org.kodein.sample.pokedex.pres.PokemonMVP

internal class PokemonPresenterImpl(private val pokedex: PokedexDownloader, arg: PokemonMVP.Arg) : PokemonMVP.Presenter {

    private val view = arg.view
    private val pokemonId = arg.pokemonId

    override fun start() = GlobalScope.launch(AppDispatcher) {
            val pokedex = pokedex.get()
            val pokemon = pokedex.findById(pokemonId)
            if (pokemon != null)
                view.displayPokemon(
                        pokemon,
                        Evolutions(
                                prev = pokemon.evolutionsPrev?.mapNotNull { pokedex.findByNum(it.num) } ?: emptyList(),
                                next = pokemon.evolutionsNext?.mapNotNull { pokedex.findByNum(it.num) } ?: emptyList()
                        )
                )
            else
                view.close()
        }

    override fun pokemonSelected(id: Int) = GlobalScope.launch(AppDispatcher) {
            val pokemon = pokedex.get().findById(id) ?: return@launch
            view.goToPokemonScreen(pokemon.name, pokemon.id)
        }

}
