package org.example.Lesson_7Practice

fun main() {
    val capitaLettersRange = ('A'..'Z')
    val smallLettersRange = ('a'..'z')
    val numberRange = ('0'..'9')
    val allRange = capitaLettersRange + smallLettersRange + numberRange

    println("Задайте длинну пароля:")
    val input = readln().toInt()
    if (input >= MIN_SYMBOL_IN_PASSWORD1) {
        val password = mutableListOf<Char>().apply {
            add(capitaLettersRange.random())
            add(smallLettersRange.random())
            add(numberRange.random())

            repeat(input - REQUIRED_CHAR_TYPES_COUNT) {
                add(allRange.random())
            }
            shuffle()
        }.joinToString("")
        println(password)
    } else {
        println("Недостаточная длина пароля, надо минимум $MIN_SYMBOL_IN_PASSWORD")
    }

}

const val MIN_SYMBOL_IN_PASSWORD1 = 6
const val REQUIRED_CHAR_TYPES_COUNT = 3