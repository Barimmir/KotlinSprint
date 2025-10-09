package org.example.Lesson_11Practice

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {
    fun displayInfo() {
        println(
            "Информация пользователя\n" +
                    "Идентификатор: $id\n" +
                    "Логин: $login\n" +
                    "Пароль:$password\n" +
                    "Почта: $email\n" +
                    "Информация о себе: $bio"
        )
    }

    fun updateBio() {
        println("Введите информацию о себе")
        bio = readlnOrNull().toString()
    }

    fun changePassword() {
        println("Введите текущий пароль:")
        val passwordInput = readlnOrNull().toString()
        if (passwordInput == password) {
            println(
                "Отлично, вы ввели правильный пароль.\n" +
                        "На какой хотите заменить его?"
            )
            val newPassword = readln()
            password = newPassword
            println("Пароль успешно изменён!")
        } else {
            println("Вы ввели неправильный логин или пароль")
        }
    }
}

fun main() {
    val user1 = User2(
        id = 228,
        login = "Наруто",
        password = "123",
        email = "gigaMan@mail.ru",
        bio = "Верну Саске в Коноху"
    )
    user1.updateBio()
    user1.changePassword()
    user1.displayInfo()
}