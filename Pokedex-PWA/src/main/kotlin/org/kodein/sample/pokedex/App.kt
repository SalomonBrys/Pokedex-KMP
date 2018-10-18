package org.kodein.sample.pokedex

import react.*
import react.dom.div
import react.router.dom.browserRouter
import react.router.dom.hashRouter
import react.router.dom.route
import react.router.dom.switch

class App : RComponent<PKProps, App.State>() {

    data class State(
        var pokemonId: Int? = null
    ) : RState

    interface IdProps : RProps {
        var id: String
    }

    override fun RBuilder.render() {
        hashRouter {
            switch {
                route<RProps>("/", exact = true) { route ->
                    child(PokemonListView::class) {
                        attrs.kodein = props.kodein
                        attrs.select = { route.history.push("/p/$it") }
                    }
                }
                route<IdProps>("/p/:id", strict = true) { route ->
                    child(PokemonView::class) {
                        attrs.kodein = props.kodein
                        attrs.select = { route.history.push("/p/$it") }
                        attrs.close = { route.history.push("/") }
                        attrs.id = route.match.params.id.toInt()
                    }
                }
            }
        }
    }

}
