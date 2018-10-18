package org.kodein.sample.pokedex

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.kodein.di.Kodein
import org.kodein.di.erased.bind
import org.kodein.di.erased.instance
import org.kodein.sample.pokedex.data.Context
import react.dom.render
import kotlin.browser.document

fun main() {

    val kodein = Kodein {
        import(businessModule)
        bind() from instance(Context())
    }

    GlobalScope.launch {
        render(document.getElementById("app")) {
            child(App::class) {
                attrs.kodein = kodein
            }
        }
    }
}
