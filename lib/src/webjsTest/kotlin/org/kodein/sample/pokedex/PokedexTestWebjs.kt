package org.kodein.sample.pokedex

import org.kodein.sample.pokedex.data.Context

actual fun runTest(block: suspend () -> Unit): Unit = throw NotImplementedError()

actual fun getTestContext(): Context = throw NotImplementedError()
