package org.kodein.sample.pokedex

import org.kodein.di.Kodein
import org.kodein.di.erased.bind
import org.kodein.di.erased.instance
import org.kodein.sample.pokedex.data.Context
import org.kodein.sample.pokedex.data.Evolutions
import org.kodein.sample.pokedex.data.PokedexDownloader
import org.kodein.sample.pokedex.data.Pokemon
import org.kodein.sample.pokedex.pres.PokemonListMVP
import org.kodein.sample.pokedex.pres.PokemonMVP
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

expect fun runTest(block: suspend () -> Unit)

expect fun getTestContext(): Context

class PokedexTest {

    @Test
    fun read_Pokedex_from_JSON_file() = runTest {

        val kodein = Kodein {
            import(businessModule)
            bind() from instance(getTestContext())
        }

        val dl: PokedexDownloader by kodein.instance()
        val pokedex = dl.get()

        assertEquals(151, pokedex.pokemons.size)
        assertEquals(
            Pokemon(
                2,
                "002",
                "Ivysaur",
                "http://www.serebii.net/pokemongo/pokemon/002.png",
                listOf("Grass", "Poison"),
                "0.99 m",
                "13.0 kg",
                "Bulbasaur Candy",
                100,
                "Not in Eggs",
                0.042,
                4.2,
                "07:00",
                listOf(1.2, 1.6),
                listOf("Fire", "Ice", "Flying", "Psychic"),
                listOf(Pokemon.Evolution("001","Bulbasaur")),
                listOf(Pokemon.Evolution("003","Venusaur"))
            ),
            pokedex.pokemons[1]
        )
    }

    @Test
    fun PokemonListPresenter_should_display_list_on_start() = runTest {
        var listCount = 0
        val view: PokemonListMVP.View = object : PokemonListMVP.View {
            override fun displayList(pokemons: List<Pokemon>) { listCount = pokemons.count() }
            override fun goToPokemonScreen(name: String, id: Int) = throw IllegalStateException()
        }

        val kodein = Kodein {
            import(businessModule)
            bind() from instance(getTestContext())
        }

        val presenter: PokemonListMVP.Presenter by kodein.instance(arg = PokemonListMVP.Arg(view))

        presenter.start().join()

        assertEquals(151, listCount)
    }

    @Test
    fun PokemonListPresenter_should_go_to_selected_pokemon_on_select() = runTest {
        var goTo = 0
        val view: PokemonListMVP.View = object : PokemonListMVP.View {
            override fun displayList(pokemons: List<Pokemon>) {}
            override fun goToPokemonScreen(name: String, id: Int) { goTo = id }
        }

        val kodein = Kodein {
            import(businessModule)
            bind() from instance(getTestContext())
        }

        val presenter: PokemonListMVP.Presenter by kodein.instance(arg = PokemonListMVP.Arg(view))

        presenter.start().join()
        presenter.pokemonSelected(42).join()

        assertEquals(42, goTo)
    }

    @Test
    fun PokemonPresenter_should_display_pokemon_on_start() = runTest {
        var pokemonDisplayed: Pokemon? = null
        val view: PokemonMVP.View = object : PokemonMVP.View {
            override fun displayPokemon(pokemon: Pokemon, evolutions: Evolutions) { pokemonDisplayed = pokemon }
            override fun goToPokemonScreen(name: String, id: Int) = throw IllegalStateException()
            override fun close() = throw IllegalStateException()
        }

        val kodein = Kodein {
            import(businessModule)
            bind() from instance(getTestContext())
        }

        val presenter: PokemonMVP.Presenter by kodein.instance(arg = PokemonMVP.Arg(view, 42))

        presenter.start().join()

        assertEquals("Golbat", pokemonDisplayed!!.name)
    }

    @Test
    fun PokemonPresenter_should_go_to_selected_pokemon_on_select() = runTest {
        var goTo = 0
        val view: PokemonMVP.View = object : PokemonMVP.View {
            override fun displayPokemon(pokemon: Pokemon, evolutions: Evolutions) {}
            override fun goToPokemonScreen(name: String, id: Int) { goTo = id }
            override fun close() = throw IllegalStateException()
        }

        val kodein = Kodein {
            import(businessModule)
            bind() from instance(getTestContext())
        }

        val presenter: PokemonMVP.Presenter by kodein.instance(arg = PokemonMVP.Arg(view, 21))

        presenter.start().join()
        presenter.pokemonSelected(42).join()

        assertEquals(42, goTo)
    }

    @Test
    fun PokemonPresenter_should_close_on_invalid_id() = runTest {
        var closed = false
        val view: PokemonMVP.View = object : PokemonMVP.View {
            override fun displayPokemon(pokemon: Pokemon, evolutions: Evolutions) = throw IllegalStateException()
            override fun goToPokemonScreen(name: String, id: Int) = throw IllegalStateException()
            override fun close() { closed = true }
        }

        val kodein = Kodein {
            import(businessModule)
            bind() from instance(getTestContext())
        }

        val presenter: PokemonMVP.Presenter by kodein.instance(arg = PokemonMVP.Arg(view, 2142))

        presenter.start().join()

        assertTrue(closed)
    }
}
