package io.nikolamicic21.section01intro

fun generics() {
    val stack = mutableStackOf(0.62, 3.14, 4.3)
    println(stack)
}

private fun <E : Number> mutableStackOf(vararg elements: E) = MutableStack(*elements)

private class MutableStack<E : Number>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeLast()

    fun isEmpty(): Boolean = elements.isEmpty()

    fun size(): Int = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}
