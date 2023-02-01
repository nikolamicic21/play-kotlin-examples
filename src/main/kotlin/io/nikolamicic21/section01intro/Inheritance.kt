package io.nikolamicic21.section01intro

fun inheritance() {
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}

private open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

private class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

private open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

private class SiberianTiger : Tiger("Siberia")

private open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

private class Asiatic(name: String) : Lion(name = name, origin = "India")
