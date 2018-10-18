package org.kodein.sample.pokedex

import org.kodein.di.Kodein
import react.RProps

open class PKProps : RProps {
    lateinit var kodein: Kodein
}