package org.example.Lesson_18Practice

class Order(
    val numberOfOrder: Int,
) {
    fun printInfo(product: String) {
        println("Заказан товар: $product")
    }

    fun printInfo(product: List<String>) {
        println("Заказан товар: ${product.joinToString()}")
    }
}

fun main() {
    val order = Order(3)
    order.printInfo("Кружка")
    order.printInfo(listOf("Круг надувной", "варежки", "шорты"))
}