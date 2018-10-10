package org.kodein.sample.pokedex.data

import kotlinx.serialization.Serializable

@Serializable
data class Pokedex(val pokemons: List<Pokemon>)


fun Pokedex.findById(id: Int) = pokemons.firstOrNull { it.id == id }

fun Pokedex.findByNum(num: String) = pokemons.firstOrNull { it.num == num }
