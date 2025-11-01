package org.example.Lesson_16Practice

class Order(
    private val orderNumber: String,
    private var status: String,
) {
    private fun changeStatus(newStatus: String) {
        status = newStatus
        println("Новый статус заказа $orderNumber: $newStatus")
    }

    fun requestStatusChange(inputStatus: String) {
        println("Статус заказа будет изменён на $inputStatus")
        changeStatus(inputStatus)
    }
}

fun main() {
    val order = Order("228", "ХЗ")
    val status = "Корги топ"
    order.requestStatusChange(status)
}