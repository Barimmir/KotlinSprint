package org.example.Lesson_11Practice

class User (
    val userLogin: String,
    val userPassword: String,
    val userEmail: String,
    val identifier: Int,
) {}

fun main() {
    val user1 = User(
        userLogin = "Мамин бродяга",
        userPassword = "нагибатор2016",
        userEmail = "СамРешу@yandex.ru",
        identifier = 228
    )
    val user2 = User(
        userLogin = "Папин симпотяга",
        userPassword = "ДедИнсайд1998",
        userEmail = "АнимэСосед@mail.ru",
        identifier = 322
    )
    println(user1.userLogin)
    println(user1.userPassword)
    println(user1.userEmail)
    println(user1.identifier)
    println()
    println(user2.userLogin)
    println(user2.userPassword)
    println(user2.userEmail)
    println(user2.identifier)
}