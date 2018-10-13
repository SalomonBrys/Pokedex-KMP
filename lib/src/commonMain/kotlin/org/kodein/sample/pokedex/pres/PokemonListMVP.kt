package org.kodein.sample.pokedex.pres

import kotlinx.coroutines.Job
import org.kodein.sample.pokedex.data.Pokemon

object PokemonListMVP : MVP<PokemonListMVP.Arg, PokemonListMVP.Presenter, PokemonListMVP.View> {

    class Arg(override val view: View) : MVP.Arg<View>

    interface Presenter : MVP.Presenter {
        fun pokemonSelected(id: Int): Job
    }

    interface View {
        fun displayList(pokemons: List<Pokemon>)
        fun goToPokemonScreen(name: String, id: Int)
    }
}
