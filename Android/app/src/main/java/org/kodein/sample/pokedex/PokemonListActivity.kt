package org.kodein.sample.pokedex

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_list.*
import kotlinx.android.synthetic.main.list_item.view.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.kodein.di.KodeinAware
import org.kodein.di.android.closestKodein
import org.kodein.di.erased.instance
import org.kodein.sample.pokedex.data.Pokemon
import org.kodein.sample.pokedex.pres.PokemonListPresenter
import org.kodein.sample.pokedex.pres.PokemonListView

class PokemonListActivity : AppCompatActivity(), KodeinAware, PokemonListView {

    inner class Adapter(val pokemons: List<Pokemon>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, type: Int) =
                ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))

        override fun getItemCount() = pokemons.count()

        override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) = viewHolder.bind(pokemons[position])

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(pokemon: Pokemon) {
                Glide.with(itemView).load(pokemon.img).into(itemView.itemImage)
                itemView.itemText.text = pokemon.name
                itemView.setOnClickListener {
                    GlobalScope.launch(Dispatchers.Main) { presenter.pokemonSelected(pokemon.id) }
                }
            }
        }
    }

    override val kodein by closestKodein()

    val presenter: PokemonListPresenter by instance(arg = (this as PokemonListView))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        recyclerView.layoutManager = LinearLayoutManager(this)

        GlobalScope.launch(Dispatchers.Main) {
            presenter.start()
        }
    }

    override fun displayList(pokemons: List<Pokemon>) {
        recyclerView.adapter = Adapter(pokemons)
    }

    override fun goToPokemonScreen(id: Int) {
        startActivity(Intent(this, PokemonActivity::class.java).apply {
            putExtra("id", id)
        })
    }
}
