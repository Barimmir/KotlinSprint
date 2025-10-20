package org.example.Lesson_14Practice

open class Liner(
   open val name: String,
   open val speed: Int,
   open val capacity: Int,
)

class Cargo(
    override val name: String,
    override val speed: Int,
    override val capacity: Int,
) : Liner(name, speed, capacity)

class Icebreaker(
    override val name: String,
    override val speed: Int,
    override val capacity: Int,
) : Liner(name, speed, capacity) {
    fun chopTheIce() {
        println("Херачу лёд хоть я каменщик и работаю 3 дня!")
    }
}

fun main() {
    val liner = Liner("Лайнер", 500, 1000)
    val cargo = Cargo("Грузовой",250,1200)
    val icebreaker = Icebreaker("Ледокол",200,750)
}