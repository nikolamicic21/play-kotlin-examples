package io.nikolamicic21.section06scopefunctions

import kotlin.properties.Delegates

fun also() {
    class Person {
        lateinit var name: String
        var age by Delegates.notNull<Int>()
        lateinit var about: String

        override fun toString(): String {
            return "Person(name='$name', age=$age, about='$about')"
        }
    }

    fun writeCreationLog(person: Person) {
        println("Logging: $person")
    }

    val jake = Person()
        .apply {
            name = "Jake"
            age = 30
            about = "Android Developer"
        }
        .also {
            writeCreationLog(it)
        }
    println(jake)
}


