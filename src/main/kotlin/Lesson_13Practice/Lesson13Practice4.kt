package org.example.Lesson_13Practice

class User4(
    val name: String?,
    val number: Long?,
    val company: String?,
) {
    fun printInfo() {
        println(
            "Имя: ${name ?: "не указано"}\n" +
                    "Номер: $number\n" +
                    "Компания: $company"
        )
    }
}

fun main() {
    val phoneBook = mutableListOf<User4>()

    println("Введите свой номер:")
    val numberInput = readln()?.toLongOrNull()
    if (numberInput == null) {
        println("Номер не введён!Повторите попытку")
    }
    println("Введите свою компанию:")
    var companyInput = readln() ?: null
    if (companyInput == null) {
        companyInput = "не указано"
    }

    val contact = User4(
        name = null,
        number = numberInput,
        company = companyInput
    )
    phoneBook.add(contact)

    phoneBook.forEach { it.printInfo() }
}