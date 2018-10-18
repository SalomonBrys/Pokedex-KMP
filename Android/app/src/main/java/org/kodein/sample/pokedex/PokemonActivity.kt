package org.kodein.sample.pokedex

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_pok.*
import kotlinx.android.synthetic.main.evol_item.*
import kotlinx.android.synthetic.main.evol_item.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.erased.instance
import org.kodein.sample.pokedex.data.Evolutions
import org.kodein.sample.pokedex.data.Pokemon
import org.kodein.sample.pokedex.pres.PokemonMVP

class PokemonActivity : AppCompatActivity(), KodeinAware, PokemonMVP.View {

    inner class Adapter(val evolutions: Evolutions) : RecyclerView.Adapter<Adapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, type: Int) =
                ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.evol_item, parent, false))

        override fun getItemCount() = evolutions.prev.count() + evolutions.next.count()

        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) = viewHolder.bind(
            if (position < evolutions.prev.count())
                evolutions.prev[position]
            else
                evolutions.next[position - evolutions.prev.count()]
        )

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(pokemon: Pokemon) {
                itemView.pokName.text = pokemon.name
                Glide.with(itemView.context).load(pokemon.img).into(itemView.pokImage)
                itemView.setOnClickListener {
                    GlobalScope.launch(Dispatchers.Main) { presenter.pokemonSelected(pokemon.id) }
                }
            }
        }
    }

    override val kodein by closestKodein()

    override fun close() = finish()

    val presenter: PokemonMVP.Presenter by instance(fArg = { PokemonMVP.Arg(this, intent.getIntExtra("id", 0)) })

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pok)

        webView.setBackgroundColor(Color.TRANSPARENT)

        GlobalScope.launch(Dispatchers.Main) {
            presenter.start()
        }
    }

    override fun displayPokemon(pokemon: Pokemon, evolutions: Evolutions) {
        title = pokemon.name
        Glide.with(this).load(pokemon.img).into(imageView)
        recyclerView.adapter = Adapter(evolutions)

        webView.loadData(
                """
                    <html>
                    <head>
                        <style type="text/css">
                            ul { list-style-type: none; }
                            li { padding: 3px 0; }
                        </style>
                    </head>
                    <body>
                        ${pokemon.htmlInfos()}
                    </body>
                    </html>
                """.trimIndent(),
                "text/html",
                "UTF-8"
        )
    }

    override fun goToPokemonScreen(name: String, id: Int) {
        startActivity(Intent(this, PokemonActivity::class.java).apply {
            putExtra("id", id)
        })
    }
}
