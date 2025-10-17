package org.example.Lesson_13Practice

class User5(
    val name: String?,
    val number: Long?,
    val company: String?,
) {
    fun printInfo() {
        println(
            "Имя: ${name ?: "не указано"}\n" +
                    "Номер: $number\n" +
                    "Компания: ${company ?: "не указана"}"
        )
    }
}

fun main() {
    println("Введите номер:")
    val numberInput: String = readln().trim()

    val number: Long? = try {
        numberInput.toLong()
    } catch (e: NumberFormatException) {
        println("Произошла ошибка: ${e.javaClass.simpleName}")
        null
    }

    val user = User5(
        name = "Фуфик",
        number = number,
        company = "Кирьешки"
    )

    user.printInfo()
}