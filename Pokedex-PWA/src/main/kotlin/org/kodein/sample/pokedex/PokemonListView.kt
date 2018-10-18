package org.kodein.sample.pokedex

import kotlinx.html.js.onClickFunction
import org.kodein.di.KodeinAware
import org.kodein.di.erased.instance
import org.kodein.sample.pokedex.data.Pokemon
import org.kodein.sample.pokedex.pres.PokemonListMVP
import react.*
import react.dom.*

class PokemonListView : RComponent<PokemonListView.Props, PokemonListView.State>(), PokemonListMVP.View, KodeinAware {

    class Props : PKProps() {
        lateinit var select: (Int) -> Unit
    }

    data class State(
        var pokemons: List<Pokemon>? = null
    ) : RState

    override val kodein get() = props.kodein

    val presenter: PokemonListMVP.Presenter by instance(arg = PokemonListMVP.Arg(this))

    override fun componentDidMount() {
        presenter.start()
    }

    override fun RBuilder.render() {
        val pokemons = state.pokemons
        if (pokemons == null) {
            h1 { +"Loading..." }
        }
        else {
            ul(classes = "pokemons") {
                pokemons.forEach { pokemon ->
                    li {
                        attrs.onClickFunction = { presenter.pokemonSelected(pokemon.id) }
                        img(src = pokemon.img) {}
                        p {
                            +pokemon.name
                        }
                    }
                }
            }
        }
    }

    override fun displayList(pokemons: List<Pokemon>) {
        setState {
            this.pokemons = pokemons
        }
    }

    override fun goToPokemonScreen(name: String, id: Int) {
        props.select(id)
    }
}