package org.kodein.sample.pokedex.data

import kotlinx.serialization.Optional
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Pokemon(
    val id: Int,
    val num: String,
    val name: String,
    val img: String,
    val type: List<String>,
    val height: String,
    val weight: String,
    @SerialName("candy") val candyName: String,
    @Optional @SerialName("candy_count") val candyCount: Int = 0,
    val egg: String,
    @SerialName("spawn_chance") val spawnChance: Double,
    @SerialName("avg_spawns") val spawnsAvg: Double,
    @SerialName("spawn_time") val spawnTime: String,
    @Optional val multipliers: List<Double>? = null,
    val weaknesses: List<String>,
    @Optional @SerialName("prev_evolution") val evolutionsPrev: List<Evolution>? = null,
    @Optional @SerialName("next_evolution") val evolutionsNext: List<Evolution>? = null
) {

    @Serializable
    data class Evolution(
            val num: String,
            val name: String
    )

    fun htmlInfos(): String = """
        <ul>
            <li><b>Types</b>: ${type.joinToString()}</li>
            <li><b>Height</b>: $height, <b>weight</b>: $weight</li>
            <li><b>Height</b>: $height, <b>weight</b>: $weight</li>
            <li><b>Candy</b>: $candyName ${if (candyCount > 0) "($candyCount)" else ""}</li>
            <li><b>Egg</b>: $egg</li>
            <li><b>Spawn</b>: $spawnsAvg ($spawnTime)</li>
            ${if (multipliers != null) "<li><b>Multipliers</b>: ${multipliers.joinToString()}</li>" else ""}
            <li><b>Weaknesses</b>: ${weaknesses.joinToString()}</li>
        </ul>
""".trimIndent()

}
