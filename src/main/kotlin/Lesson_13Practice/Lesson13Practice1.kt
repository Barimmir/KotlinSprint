package org.example.Lesson_13Practice

class User(
    val name: String,
    val number: Long,
    val company: String?,
)

fun main() {
    val user1 = User(
        name = "Лёха",
        number = 79563225677,
        company = null
    )
}