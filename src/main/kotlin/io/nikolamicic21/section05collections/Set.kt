package io.nikolamicic21.section05collections

fun `set`() {
    val aNewIssue = "uniqueDescr4"
    val anIssueAlreadyIn = "uniqueDescr2"

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}

private val openIssues = mutableSetOf(
    "uniqueDescr1",
    "uniqueDescr2",
    "uniqueDescr3"
)

private fun addIssue(uniqueDesc: String) = openIssues.add(uniqueDesc)

private fun getStatusLog(isAdded: Boolean): String =
    if (isAdded) "registered correctly" else "marked as duplicate and rejected"
