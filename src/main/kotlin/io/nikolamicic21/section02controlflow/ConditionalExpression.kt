package io.nikolamicic21.section02controlflow

fun conditionalExpression() {
    println(max(99, -42))
}

private fun max(a: Int, b: Int) = if (a > b) a else b
