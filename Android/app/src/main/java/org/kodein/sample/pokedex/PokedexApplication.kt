package org.kodein.sample.pokedex

import android.app.Application
import android.os.Build
import android.webkit.WebView
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

    override fun onCreate() {
        super.onCreate()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(true)
        }
    }
}
