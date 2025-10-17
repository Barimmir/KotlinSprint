package org.example.Lesson_13Practice

class User4(
    val name: String?,
    val number: Long,
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
    val phoneBook = mutableListOf<User4>()
    while (true) {
        println(
            "Введите своё имя: \n" +
                    "Внимание! Оставте поле пустым если хотите выйти из программы!"
        )
        val nameInput = readln().trim()
        if (nameInput.isEmpty()) {
            println("Выход из программы!")
            break
        }
        println("Введите номер телефона:")
        val numberInput = readln().toLongOrNull()
        if (numberInput == null) {
            println("Ошибка: номер телефона должен содержать только цифры! Запись не добавлена.")
            return
        }
        println("Введите название компании:")
        val companyInput = readln().trim()
        val company = if (companyInput.isEmpty()) null else companyInput

        val contact = User4(
            name = null,
            number = numberInput,
            company = company
        )
        phoneBook.add(contact)
    }
    phoneBook.forEach { it.printInfo() }
}