package org.example.Lesson_14Practice

open class Liner(
    val name: String,
    val speed: Int,
    val capacity: Int,
)

class Cargo(
    name: String,
    speed: Int,
    capacity: Int,
) : Liner(name, speed, capacity)

class Icebreaker(
    name: String,
    speed: Int,
    capacity: Int,
) : Liner(name, speed, capacity) {
    fun chopTheIce() {
        println("Херачу лёд хоть я каменщик и работаю 3 дня")
    }
}

fun main() {
    val liner = Liner("Лайнер", 500, 1000)
    val cargo = Cargo("Грузовой",250,1200)
    val icebreaker = Icebreaker("Ледокол",200,750)
}