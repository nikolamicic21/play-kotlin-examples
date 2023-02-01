package io.nikolamicic21.section06scopefunctions

fun run() {
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}

private fun getNullableLength(ns: String?) {
    println("for \"$ns\":")
    val result = ns?.run {
        println("\tis empty? ${isEmpty()}")
        println("\tlength = $length")
        length
    }
    println(result)
}
