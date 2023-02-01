package io.nikolamicic21.section05collections

import kotlin.math.abs

fun operators() {
    filterOperator()
    mapOperator()
    anyOperator()
    allOperator()
    noneOperator()
    findOperator()
    firstLastOperator()
    countOperator()
    associateByAndGroupByOperator()
    partitionOperator()
    flatMapOperator()
    minOrNullAndMaxOrNullOperator()
    sortedOperator()
    mapElementAccess()
    zip()
    getOrElse()
}

private val numbers = listOf(1, -2, 3, -4, 5, -6)

private fun filterOperator() {
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { it < 0 }
    println(positives)
    println(negatives)
}

private fun mapOperator() {
    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { it * 3 }
    println(doubled)
    println(tripled)
}

private fun anyOperator() {
    val anyNegative = numbers.any { it < 0 }
    val anyGt6 = numbers.any { it > 6 }
    println("anyNegative: $anyNegative")
    println("anyGt6: $anyGt6")
}

private fun allOperator() {
    val allEven = numbers.all { it % 2 == 0 }
    val allLt6 = numbers.all { it < 6 }
    println("allEven: $allEven")
    println("allLt6: $allLt6")
}

private fun noneOperator() {
    val nonOdd = numbers.none { it % 2 == 1 }
    val nonGt6 = numbers.none { it > 6 }
    println("nonOdd: $nonOdd")
    println("nonGt6: $nonGt6")
}

private val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

private fun findOperator() {
    val first = words.find { it.startsWith("some") }
    val last = words.findLast { it.startsWith("some") }
    val nothing = words.find { it.contains("nothing") }
    println(first)
    println(last)
    println(nothing)
}

private fun firstLastOperator() {
    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 == 1 }

    println(first)
    println(last)
    println(firstEven)
    println(lastOdd)

    val empty = emptyList<String>()

    val firstEmpty = empty.firstOrNull()
    val lastEmpty = empty.lastOrNull()
    val firstF = words.firstOrNull { it.startsWith("f") }
    val firstZ = words.firstOrNull { it.startsWith("z") }
    val lastF = words.lastOrNull { it.endsWith("f") }
    val lastZ = words.lastOrNull { it.endsWith("z") }

    println(firstEmpty)
    println(lastEmpty)
    println(firstF)
    println(firstZ)
    println(lastF)
    println(lastZ)
}

private fun countOperator() {
    val totalCount = numbers.count()
    val evenCount = numbers.count { it % 2 == 0 }

    println(totalCount)
    println(evenCount)
}

private data class Person(val name: String, val city: String, val phone: String)

private val people = listOf(
    Person("John", "Boston", "+1-888-123456"),
    Person("Sarah", "Munich", "+49-777-789123"),
    Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
    Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
)

private fun associateByAndGroupByOperator() {
    val phoneBook = people.associateBy { it.phone }
    val cityBook = people.associateBy(Person::phone, Person::city)
    val peopleCities = people.groupBy(Person::city, Person::name)
    val lastPersonCity = people.associateBy(Person::city, Person::name)

    println(phoneBook)
    println(cityBook)
    println(peopleCities)
    println(lastPersonCity)
}

private fun partitionOperator() {
    val evenOdd = numbers.partition { it % 2 == 0 }
    val (positives, negatives) = numbers.partition { it > 0 }
    println(evenOdd)
    println("positives: $positives, negatives: $negatives")
}

private fun flatMapOperator() {
    val fruitsBag = listOf("apple", "orange", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")
    val cart = listOf(fruitsBag, clothesBag)

    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }
    println(mapBag)
    println(flatMapBag)
}

private fun minOrNullAndMaxOrNullOperator() {
    val numbers = listOf(1, 2, 3)
    val empty = emptyList<Int>()
    val only = listOf(3)

    println("Numbers: $numbers, min = ${numbers.minOrNull()} max = ${numbers.maxOrNull()}")
    println("Empty: $empty, min = ${empty.minOrNull()} max = ${empty.maxOrNull()}")
    println("Only: $only, min = ${only.minOrNull()} max = ${only.maxOrNull()}")
}

private fun sortedOperator() {
    val shuffled = numbers.shuffled()
    val natural = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it }
    val descending = shuffled.sortedDescending()
    val descendingBy = shuffled.sortedByDescending { abs(it) }

    println("natural: $natural")
    println("inverted: $inverted")
    println("descending: $descending")
    println("descendingBy: $descendingBy")
}

private fun mapElementAccess() {
    val map = mapOf("key" to 42)

    val value1 = map["key"]
    println(value1)
    val value2 = map["key2"]
    println(value2)

    val value3 = map.getValue("key")
    println(value3)

    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("key2")
    println(value4)

    try {
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {
        println("Message: ${e.message}")
    }
}

private fun zip() {
    val a = listOf("a", "b", "c")
    val b = listOf(1, 2, 3, 4)
    val resultPairs = a zip b
    val resultReduce = a.zip(b) { arg1, arg2 -> "$arg1$arg2" }
    println(resultPairs)
    println(resultReduce)
}

private fun getOrElse() {
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 })
    println(list.getOrElse(10) { 42 })

    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") { 1 })

    map["x"] = 3
    println(map.getOrElse("x") { 1 })

    map["x"] = null
    println(map.getOrElse("x") { 1 })
}

