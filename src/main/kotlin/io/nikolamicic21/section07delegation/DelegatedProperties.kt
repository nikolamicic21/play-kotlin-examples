package io.nikolamicic21.section07delegation

import kotlin.reflect.KProperty

fun delegatedProperties() {
    val e = Example()
    println(e.p)
    e.p = "NEW"

    val sample = LazySample()
    println("lazyStr = ${sample.lazyStr}")
    println(" = ${sample.lazyStr}")
}

private class Example {
    var p: String by Delegate()

    override fun toString() = "Example Class"
}

private class Delegate {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}

private class LazySample {
    init {
        println("created!")
    }

    val lazyStr: String by lazy {
        println("computed!")
        "my lazy"
    }
}
