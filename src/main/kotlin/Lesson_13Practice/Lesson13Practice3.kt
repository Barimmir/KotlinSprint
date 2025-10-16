package org.example.Lesson_13Practice

class User3(
    val name: String,
    val number: Long,
    val company: String? = null,
)

fun main() {
    val contact = listOf(
        User3("Алексей", 89997776655, null),
        User3("Сява", 89993336655, null),
        User3("Гиви", 89993221763, "null"),
        User3("Фрося", 89992221232, "Голубая лагуна"),
        User3("Паша", 89994443456, "Собиратель консервных банок"),
    )
    contact.filter { it.company != null }.forEach { println(it.company) }
}