package org.example.Lesson_10Practice

fun main() {
    println("Введите длину пароля:")
    val lengthPassword = readln().toInt()
    println("Ваш пароль: ${generatesAPassword(lengthPassword)}")
}

fun generatesAPassword(lengthPassword: Int): String {
    val rangeSymbol1 = (0..9).joinToString()
    val rangeSymbol2 = "!\"#\$%&'()*+,-./ "
    val listSymbol =rangeSymbol1 + rangeSymbol2
    return (1 .. lengthPassword).map {listSymbol.random()}.joinToString("")
}