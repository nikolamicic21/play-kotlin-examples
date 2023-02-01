package io.nikolamicic21.section04functional

fun extensionFunctions() {
    val order = Order(
        listOf(
            Item("Bread", 25.0F),
            Item("Wine", 29.0F),
            Item("Water", 12.0F)
        )
    )

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")

    val nullOrder: Order? = null
    println(nullOrder.nullSafeToString())
}

private data class Item(val name: String, val price: Float)

private data class Order(val items: Collection<Item>)

private fun Order.maxPricedItemValue(): Float = items.maxByOrNull { it.price }?.price ?: 0F
private fun Order.maxPricedItemName(): String = items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"
private val Order.commaDelimitedItemNames: String
    get() = items.joinToString { it.name }

private fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"
