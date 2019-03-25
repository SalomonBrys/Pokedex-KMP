package org.kodein.sample.pokedex

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual val AppDispatcher: CoroutineDispatcher = Dispatchers.Default
