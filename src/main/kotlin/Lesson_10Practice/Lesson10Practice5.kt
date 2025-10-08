package org.example.Lesson_10Practice

fun main() {
    val token = logsIn()
    if (token != null) {
        val cart = getCart(token)
        if (cart != null) {
            println("Содержимое корзины:")
            cart.forEachIndexed { index, product ->
                println("${index + 1}. $product")
            }
        } else {
            println("Неверный токен доступа")
        }
    } else {
        println("Неудачная авторизация! Ты даже не способен запомнить логин и пароль?")
    }

}

fun logsIn(): String? {
    println("Введите логин:")
    val loginInput = readlnOrNull()
    println("Введите пароль:")
    val passwordInput = readlnOrNull()
    return if (loginInput == LOGIN && passwordInput == PASSWORD) {
        println("Успешная авторизация")
        generatesAnAccessToken()
    } else {
        println("Неверные данные для входа")
        null
    }
}

fun generatesAnAccessToken(): String {
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return (MIN_LENGTH_TOKEN..MAX_LENGTH_TOKEN).map { chars.random() }.joinToString("")
}

fun getCart(token: String): List<String>? {
    if (!isValidToken(token)) {
        return null
    }
    return listOf(
        "Водка - бесценно!",
        "водочка - бесценна!",
        "пивасик - божественнен!",
        "и селёдочка - закусь!"
    )
}

fun isValidToken(token: String): Boolean {
    if (token.length != MAX_LENGTH_TOKEN) return false
    val validChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    return token.all { it in validChars }
}

const val LOGIN = "Пупа"
const val PASSWORD = "Лупа"
const val MIN_LENGTH_TOKEN = 1
const val MAX_LENGTH_TOKEN = 32