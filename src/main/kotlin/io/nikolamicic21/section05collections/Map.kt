package io.nikolamicic21.section05collections

fun map() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()
}

private const val POINTS_X_PASS = 15

private val EZPassAccounts = mutableMapOf(
    1 to 100,
    2 to 100,
    3 to 100
)

private val EZPassReport: Map<Int, Int> = EZPassAccounts

private fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) +
                POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

private fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach { (k, v) -> println("ID $k: credit $v") }
}
