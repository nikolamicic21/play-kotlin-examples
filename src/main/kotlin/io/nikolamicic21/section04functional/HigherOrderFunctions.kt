package io.nikolamicic21.section04functional

fun higherOrderFunctions() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")

    val func = operation()
    println(func(2))
}

private fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

private fun sum(x: Int, y: Int) = x + y

private fun operation(): (Int) -> Int {
    return ::square
}

private fun square(x: Int) = x * x
