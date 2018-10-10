package org.kodein.sample.pokedex

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_pok.*
import kotlinx.android.synthetic.main.evol_item.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.direct
import org.kodein.di.erased.factory2
import org.kodein.sample.pokedex.data.Evolution
import org.kodein.sample.pokedex.data.Pokemon
import org.kodein.sample.pokedex.pres.PokemonPresenter
import org.kodein.sample.pokedex.pres.PokemonView

class PokemonActivity : AppCompatActivity(), KodeinAware, PokemonView {

    inner class Adapter(val evolutions: List<Evolution>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, type: Int) =
                ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.evol_item, parent, false))

        override fun getItemCount() = evolutions.count()

        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) = viewHolder.bind(evolutions[position])

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(evolution: Evolution) {
                itemView.itemText.text = evolution.name
                itemView.setOnClickListener {
                    GlobalScope.launch(Dispatchers.Main) { presenter.pokemonSelected(evolution.num) }
                }
            }
        }
    }

    override val kodein by closestKodein()

    override fun close() = finish()

    val presenter: PokemonPresenter by lazy { direct.factory2<Int, PokemonView, PokemonPresenter>().invoke(intent.getIntExtra("id", 0), this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pok)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        GlobalScope.launch(Dispatchers.Main) {
            presenter.start()
        }
    }

    override fun displayPokemon(pokemon: Pokemon) {
        title = pokemon.name
        Glide.with(this).load(pokemon.img).into(imageView)
        recyclerView.adapter = Adapter((pokemon.evolutionsPrev ?: emptyList()) + (pokemon.evolutionsNext ?: emptyList()))
    }

    override fun goToPokemonScreen(id: Int) {
        startActivity(Intent(this, PokemonActivity::class.java).apply {
            putExtra("id", id)
        })
    }
}
