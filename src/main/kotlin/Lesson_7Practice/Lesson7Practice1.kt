package org.example.Lesson_7Practice

fun main() {
    val range1 = 'a'..'z'
    val range2 = 0..9
    var password = ""

    for (position in 1..6) {
        if (position % 2 == 0) {
            password += range2.random()
        } else {
            password += range1.random()
        }
    }
    println("Здравствуйте, ваш сегенерированный пароль: $password")
}