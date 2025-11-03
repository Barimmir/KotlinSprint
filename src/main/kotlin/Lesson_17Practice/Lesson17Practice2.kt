package org.example.Lesson_17Practice

class Ship(
    name: String,
    val averageSpeed: Int,
    val port: String,
) {
    var name: String = name
        set(value) {
            println("Имя $name не может быть изменено на $value")
        }
}

fun main() {
    val ship = Ship("Пупок", 200, "Всёк")
    println(ship.name)
    ship.name = "Лучок"
    println(ship.name)
}