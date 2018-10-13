package org.kodein.sample.pokedex.pres

import kotlinx.coroutines.Job
import org.kodein.di.Kodein
import org.kodein.di.bindings.BindingKodein
import org.kodein.di.erased.bind
import org.kodein.di.erased.factory

@Suppress("unused")
interface MVP<A: MVP.Arg<V>, P : MVP.Presenter, V : Any> {

    interface Arg<V> {
        val view: V
    }

    interface Presenter {
        fun start(): Job
    }

}

inline fun <reified A: MVP.Arg<V>, reified P : MVP.Presenter, reified V : Any> Kodein.Builder.bindMVP(@Suppress("UNUSED_PARAMETER") mvp: MVP<A, P, V>, crossinline f: BindingKodein<Any?>.(A) -> P) =
        bind<P>() with factory { arg: A -> f(arg) }
