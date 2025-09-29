package org.example.Lesson_7Practice

fun main() {
    val lettersRange = 'a'..'z'
    val numberRange = 0..9
    var password = ""

    for (position in MIN_SYMBOL_IN_PASSWORD..MAX_SYMBOL_IN_PASSWORD) {
        if (position % 2 == 0) {
            password += numberRange.random().toString()
        } else {
            password += lettersRange.random().toString()
        }
    }
    println("Здравствуйте, ваш сегенерированный пароль: $password")
}

const val MIN_SYMBOL_IN_PASSWORD = 1
const val MAX_SYMBOL_IN_PASSWORD = 6
