package org.example.Lesson_7Practice

fun main() {
    val capitaLettersRange = ('A'..'Z').toList()
    val smallLettersRange = ('a'..'z').toList()
    val numberRange = ('0'..'9').toList()
    val allRange = capitaLettersRange + smallLettersRange + numberRange

    println("Задайте длинну пароля:")
    val input = readln().toInt()
    if (input >= MIN_SYMBOL_IN_PASSWORD) {
        val password = mutableListOf<Char>().apply {
            add(capitaLettersRange.random())
            add(smallLettersRange.random())
            add(numberRange.random())

            repeat(input - DECREASE) {
                add(allRange.random())
            }
            shuffled()
        }.joinToString("")
        println(password)
    } else {
        println("Недостаточная длина пароля, надо минимум $MIN_SYMBOL_IN_PASSWORD")
    }

}

const val MIN_SYMBOL_IN_PASSWORD = 6
const val DECREASE = 3