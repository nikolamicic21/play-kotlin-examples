package io.nikolamicic21.section06scopefunctions

fun with() {
    with(Config) {
        println("$host:$port")
    }
}

private object Config {
    val host: String = "localhost"
    val port: String = "8080"
}
