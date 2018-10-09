package org.kodein.sample.pokedex.data

import kotlinx.serialization.Serializable

@Serializable
data class Evolution(
    val num: String,
    val name: String
)