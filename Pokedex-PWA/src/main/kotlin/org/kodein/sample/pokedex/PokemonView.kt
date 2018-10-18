package org.kodein.sample.pokedex

import kotlinx.html.id
import kotlinx.html.js.onClickFunction
import org.kodein.di.KodeinAware
import org.kodein.di.direct
import org.kodein.di.erased.instance
import org.kodein.sample.pokedex.data.Evolutions
import org.kodein.sample.pokedex.data.Pokemon
import org.kodein.sample.pokedex.pres.PokemonMVP
import react.RBuilder
import react.RComponent
import react.RState
import react.dom.b
import react.dom.div
import react.dom.img
import react.dom.p
import react.setState

class PokemonView: RComponent<PokemonView.Props, PokemonView.State>(), PokemonMVP.View, KodeinAware {

    class Props : PKProps() {
        var id: Int = 0
        lateinit var select: (Int) -> Unit
        lateinit var close: () -> Unit
    }

    data class State(
        var pair: Pair<Pokemon, Evolutions>? = null
    ) : RState

    override val kodein get() = props.kodein

    lateinit var presenter: PokemonMVP.Presenter

    override fun componentDidMount() {
        presenter = direct.instance(arg = PokemonMVP.Arg(this, props.id))
        presenter.start()
    }

    override fun componentDidUpdate(prevProps: Props, prevState: State, snapshot: Any) {
        presenter = direct.instance(arg = PokemonMVP.Arg(this, props.id))
        presenter.start()
    }

    override fun RBuilder.render() {
        div(classes="pokemon") {
            val pair = state.pair ?: return
            val (pokemon, evolutions) = pair
            img(src = pokemon.img) {}
            div {
                consumer.onTagContentUnsafe {
                    +pokemon.htmlInfos()
                }
            }
            div {
                attrs.id = "evolutions"
                for ((title, evs) in listOf("Prev" to evolutions.prev, "Next" to evolutions.next)) {
                    if (evs.isEmpty())
                        continue
                    p { b { +"$title:" } }
                    for (ev in evs)
                        p(classes = "ev") {
                            attrs.onClickFunction = {
                                props.select(ev.id)
                            }

                            img(src = ev.img) {}
                            +ev.name
                        }
                }
            }
        }
    }

    override fun displayPokemon(pokemon: Pokemon, evolutions: Evolutions) {
        setState {
            pair = pokemon to evolutions
        }
    }

    override fun goToPokemonScreen(name: String, id: Int) {
        props.select(id)
    }

    override fun close() {
        props.close()
    }

}
