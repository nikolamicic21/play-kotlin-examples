package io.nikolamicic21.section05collections

fun `list`() {
    addSystemUser(4)
    println("tot sudoers: ${getSystemSudoers().size}")
    getSystemSudoers().forEach { println("Some useful info on user $it") }
}

private val systemUsers = mutableListOf(1, 2, 3)
private val sudoers: List<Int> = systemUsers

private fun addSystemUser(newUser: Int) = systemUsers.add(newUser)
private fun getSystemSudoers() = sudoers
