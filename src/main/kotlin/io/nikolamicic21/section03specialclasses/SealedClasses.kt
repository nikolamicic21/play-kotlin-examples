package io.nikolamicic21.section03specialclasses

fun sealedClasses() {
    println(greetMammal(Cat("Snowy")))
}

private fun greetMammal(mammal: Mammal) =
    when (mammal) {
        is Human -> "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> "Hello ${mammal.name}"
    }

private sealed class Mammal(val name: String)

private class Cat(val catName: String) : Mammal(catName)
private class Human(val humanName: String, val job: String) : Mammal(humanName)
