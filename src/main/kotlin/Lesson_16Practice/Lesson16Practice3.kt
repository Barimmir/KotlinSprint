package org.example.Lesson_16Practice

class User(
    private val login: String,
    private val password: String,
) {
    fun validate(inputLogin: String, inputPassword: String): Boolean {
        return inputLogin == login && inputPassword == password
    }
}

fun main() {
    val user = User("Лёха", "123")
    val login = "Лёха"
    val password = "123"
    println("Логин и пароль: ${user.validate(login, password)}")
}