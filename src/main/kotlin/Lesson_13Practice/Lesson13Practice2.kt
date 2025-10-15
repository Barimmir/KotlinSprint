package org.example.Lesson_13Practice

class User2(
   val name: String,
   val number: Long,
   val company: String? = null,
) {
    fun printInfo() {
        println("Имя: $name, Номер: $number, Компания: $company")
    }
}

fun main() {
    val user1 = User2(
        name = "Фрося",
        number = 89123456789,
        company = null?: "Не указано"
    )
    user1.printInfo()
}