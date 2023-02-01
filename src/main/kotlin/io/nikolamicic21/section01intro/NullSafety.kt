package io.nikolamicic21.section01intro

fun nullSafety() {
    var neverNull: String = "This can't be null"
//    neverNull = null

    var nullable: String? = "You can keep null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
//    inferredNonNull = null

    strLength(neverNull)
//    strLength(nullable)

    println(describeString(null))
}

private fun strLength(notNull: String): Int = notNull.length

private fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}
