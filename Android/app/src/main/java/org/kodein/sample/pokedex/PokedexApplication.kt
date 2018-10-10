package org.kodein.sample.pokedex

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.erased.bind
import org.kodein.di.erased.instance
import org.kodein.sample.pokedex.data.Context

class PokedexApplication : Application(), KodeinAware {

    override val kodein = Kodein.lazy {
        import(businessModule)
        bind() from instance(Context(this@PokedexApplication.applicationContext))
    }

}
