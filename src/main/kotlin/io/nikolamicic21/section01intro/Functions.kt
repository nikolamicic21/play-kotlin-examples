package io.nikolamicic21.section01intro

fun functions() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Warn", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))

//    printMessage(2 times "Bye")
    val pair = "Ferrari" to "Katrina"
    printMessage(pair.toString())
    val myPair = "McLaren" onto "Lucas"
    printMessage(myPair.toString())

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
    printMessage("${sophia}, likes: ${sophia.likedPeople}")

    printMessage(2 * "Bye")
    val str = "Always forgive your enemies; nothing annoys them so much"
    printMessage(str[0..14])

    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "
    )
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}

private fun printMessage(message: String) {
    println(message)
}

private fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

private fun sum(x: Int, y: Int): Int {
    return x + y
}

private fun multiply(x: Int, y: Int) = x * y

// Infix functions
// private infix fun Int.times(str: String) = str.repeat(this)

private infix fun String.onto(other: String) = Pair(this, other)

private data class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}

// Operator functions
private operator fun Int.times(str: String) = str.repeat(this)

private operator fun String.get(range: IntRange) = substring(range)

// Varargs
private fun printAll(vararg messages: String) {
    for (m in messages) printMessage(m)
}

private fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (m in messages) printMessageWithPrefix(prefix = prefix, message = m)
}

private fun log(vararg entries: String) {
    printAll(*entries)
}
