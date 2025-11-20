package org.example.Lesson_22Practice

class RegularBook2(
    val name: String,
    val author: String,
)

data class DataBook2(
    val name: String,
    val author: String,
)

fun main() {
    val regularBook = RegularBook2("Где-то в маршрутке", "УткоДав")
    val dataBook = DataBook2("Аниме это жизнь", "ДедИнсайд")
    println(regularBook)
    /* Это строковое значение объекта по умолчанию, потому что под капотом этот класс считается Any и без
    функции переопределения поведения и привода к String будет выводить пакет в котором находится файл, название класс и хэш код */
    println(dataBook)
    /* В этом же случае под капотом автоматически приводится к toString() и поэтому показывает
    имя класса со свойствами и значениями */
}