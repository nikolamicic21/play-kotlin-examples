package io.nikolamicic21.section02controlflow

fun loops() {
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake")
    }

    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 5) {
        eatCake()
        cakesEaten++
    }
    do {
        bakeCake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)

    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))
    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}

private fun eatCake() = println("Eat a Cake")
private fun bakeCake() = println("Bake a Cake")

private class Animal(val name: String)

private class Zoo(val animals: List<Animal>) {
//    operator fun iterator(): Iterator<Animal> = animals.iterator()
}

private operator fun Zoo.iterator(): Iterator<Animal> = animals.iterator()
