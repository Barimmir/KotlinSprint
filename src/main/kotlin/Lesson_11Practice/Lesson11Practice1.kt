package org.example.Lesson_11Practice

class User(
    val id: Int,
    val Login: String,
    val Password: String,
    val Email: String,
)

fun main() {
    val user1 = User(
        id = 228,
        Login = "Мамин бродяга",
        Password = "нагибатор2016",
        Email = "СамРешу@yandex.ru",
    )
    val user2 = User(
        id = 322,
        Login = "Папин симпотяга",
        Password = "ДедИнсайд1998",
        Email = "АнимэСосед@mail.ru",
    )
    println(user1.id)
    println(user1.Login)
    println(user1.Password)
    println(user1.Email)
    println()
    println(user2.id)
    println(user2.Login)
    println(user2.Password)
    println(user2.Email)
}