package org.example.Lesson_14Practice

open class Liner(
    val name: String = "Лайнер",
    val speed: Int = 500,
    val capacity: Int = 1000,
)

class Cargo(
    name: String = "Грузовой",
    speed: Int = 250,
    capacity: Int = 1200,
) : Liner(name, speed, capacity)

class Icebreaker(
    name: String = "Ледокол",
    speed: Int = 200,
    capacity: Int = 750,
) : Liner(name, speed, capacity) {
    fun chopTheIce() {
        println("Херачу лёд хоть я каменщик и работаю 3 дня")
    }
}

