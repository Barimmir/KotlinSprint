package org.example.Lesson_10Practice

fun main() {
    println("Введите длину пароля:")
    val lengthPassword = readln().toInt()
    println("Ваш пароль: ${generatesAPassword(lengthPassword)}")
}

fun generatesAPassword(lengthPassword: Int): String {
    val rangeSymbol1 = (0..9).joinToString()
    val rangeSymbol2 = "!\"#\$%&'()*+,-./ "
    return (0 until lengthPassword).map{
        index -> if (index % 2 == 0) rangeSymbol1.random()
        else rangeSymbol2.random()}.joinToString("")
}