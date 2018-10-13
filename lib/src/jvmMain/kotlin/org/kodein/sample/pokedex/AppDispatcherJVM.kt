package org.kodein.sample.pokedex

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Unconfined

actual val AppDispatcher: CoroutineDispatcher = Unconfined
