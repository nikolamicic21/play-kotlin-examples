package io.nikolamicic21.section06scopefunctions

fun let() {
    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(empty)

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First", "Second")
}

private fun printNonNull(str: String?) {
    println("Printing \"$str\":")
    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}

private fun printIfBothNonNull(strOne: String?, strTwo: String?) {
    strOne?.let { firstStr ->
        strTwo?.let { secondStr ->
            customPrint("$firstStr : $secondStr")
            println()
        }
    }
}

private fun customPrint(text: String) {
    println("customPrint === $text")
}
