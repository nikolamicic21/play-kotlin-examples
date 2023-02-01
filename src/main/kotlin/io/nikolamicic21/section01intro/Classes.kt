package io.nikolamicic21.section01intro

fun classes() {
    val customer = Customer()

    val contact = Contact(1, "mary@gmail.com")
    println(contact.id)
    contact.email = "jane@gmail.com"
}

private class Customer

private class Contact(val id: Int, var email: String)

