package io.nikolamicic21.section08productivitybooster

fun destructuringDeclarations() {
    val (x, y, z) = arrayOf(5, 10, 15, 20)
    println("x: $x, y: $y, z: $z")

    val map = mapOf("alice" to 21, "bob" to 25)
    for ((name, age) in map) {
        println("$name is $age years old")
    }

    val user = getUser()
    val (username, email) = user
    println(username == user.component1())

    val (_, emailAddress) = getUser()
    println(emailAddress)

    val (num, name) = Pair(1, "one")
    println("num = $num, name = $name")
}

private fun getUser() = User("Mary", "mary@somewhere.com")

private data class User(val username: String, val email: String)
