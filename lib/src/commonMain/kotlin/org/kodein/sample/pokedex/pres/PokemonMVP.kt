package org.kodein.sample.pokedex.pres

import org.kodein.sample.pokedex.data.Evolutions
import org.kodein.sample.pokedex.data.Pokemon

object PokemonMVP : MVP<PokemonMVP.Arg, PokemonMVP.Presenter, PokemonMVP.View> {

    class Arg(override val view: View, val pokemonId: Int) : MVP.Arg<View>

    interface Presenter : MVP.Presenter {
        fun pokemonSelected(num: String)
    }

    interface View {
        fun displayPokemon(pokemon: Pokemon, evolutions: Evolutions)
        fun goToPokemonScreen(name: String, id: Int)
        fun close()
    }

}
