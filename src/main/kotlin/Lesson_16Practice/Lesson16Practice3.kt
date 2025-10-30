package org.example.Lesson_16Practice

class User(
    private val login: String,
    private val password: String,
) {
    fun validatePassword(inputPassword: String): Boolean {
        return inputPassword == password
    }

    fun validateLogin(inputLogin: String): Boolean {
        return inputLogin == login
    }
}

fun main() {
    val user = User("Лёха", "123")
    val login = "Лёха"
    val password = "123"
    println(
        "Логин: ${user.validateLogin(login)} \n" +
                "Пароль: ${user.validatePassword(password)}"
    )
}