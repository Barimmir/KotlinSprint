package org.example.Lesson_13Practice

class User(
    name: String,
    number: Long,
    company: String?,
)

fun main() {
    val user1 = User(
        name = "Лёха",
        number = 79563225677,
        company = null
    )
}