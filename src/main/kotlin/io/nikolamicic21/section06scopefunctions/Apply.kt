package io.nikolamicic21.section06scopefunctions

import kotlin.properties.Delegates

fun apply() {
    val jake = Person()
    val stringDesc = jake.apply {
        name = "JakeStr"
        age = 30
        about = "Android Developer"
    }.toString()
    println(stringDesc)
}

private class Person {
    lateinit var name: String
    var age by Delegates.notNull<Int>()
    lateinit var about: String

    override fun toString(): String {
        return "Person(name='$name', age=$age, about='$about')"
    }
}
