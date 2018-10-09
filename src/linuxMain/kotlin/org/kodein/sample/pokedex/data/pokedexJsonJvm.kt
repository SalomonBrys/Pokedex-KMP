package org.kodein.sample.pokedex.data

import kotlinx.cinterop.*
import platform.posix.*

actual class Context

internal actual suspend fun getPokedexJson(ctx: Context): String {
    val pathPtr = getenv("pokedex")?.toKString() ?: throw IllegalStateException("No pokedex environment variable")
    val file = fopen(pathPtr, "r")
    fseek(file, 0, SEEK_END)
    val length = ftell(file)
    fseek(file, 0, SEEK_SET)
    val buffer = nativeHeap.allocArray<ByteVar>(length)
    fread(buffer, 1.convert(), length.convert(), file)
    fclose(file)
    val ret = buffer.toKString()
    nativeHeap.free(buffer)
    return ret
}
