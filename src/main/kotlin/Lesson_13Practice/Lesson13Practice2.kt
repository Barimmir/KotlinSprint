package org.example.Lesson_13Practice

class User2(
    val name: String,
    val number: Long,
    val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name\n Номер: $number\n Компания: ${company ?: "не указано"}")
    }
}

fun main() {
    val user1 = User2(
        name = "Фрося",
        number = 89123456789,
    )
    user1.printInfo()
}