package org.kodein.sample.pokedex

import kotlinx.coroutines.runBlocking
import org.kodein.sample.pokedex.data.Context

actual fun runTest(block: suspend () -> Unit) = runBlocking { block() }

actual fun getTestContext() = Context()
