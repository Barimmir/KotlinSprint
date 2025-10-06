package org.example.Lesson_10Practice


fun main() {
    println("Введите логин:")
    val login = readlnOrNull().toString()
    println("Введите пароль")
    val password = readlnOrNull().toString()
    checkTheLength(login, password)
}

fun checkTheLength(password: String, login: String) {
    val minSymbol = 4
    if (minSymbol > login.length || minSymbol > password.length) {
        println("Логин или пароль недостаточно длинные!")
    } else {
        println("Добро пожаловать!")
    }
}
