package org.example.Lesson_11Practice

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1 = User(
        id = 228,
        login = "Мамин бродяга",
        password = "нагибатор2016",
        email = "СамРешу@yandex.ru",
    )
    val user2 = User(
        id = 322,
        login = "Папин симпотяга",
        password = "ДедИнсайд1998",
        email = "АнимэСосед@mail.ru",
    )
    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)
    println()
    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}