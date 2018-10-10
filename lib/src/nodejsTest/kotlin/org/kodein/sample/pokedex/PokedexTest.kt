package org.kodein.sample.pokedex

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.promise
import org.kodein.sample.pokedex.data.Context

actual fun runTest(block: suspend () -> Unit): dynamic = GlobalScope.promise { block() }

actual fun getTestContext() = Context()
