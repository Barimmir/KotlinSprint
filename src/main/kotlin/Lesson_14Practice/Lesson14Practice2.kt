package org.example.Lesson_14Practice

open class Liner1(
    open val name: String,
    open val speed: Int,
    open val capacity: Int,
) {
    fun printInfo() {
        println(
            "===Информация о корабле===\n" +
                    "Имя: $name\n" +
                    "Скорость: $speed\n" +
                    "Грузоподьёмность: $capacity"
        )
    }

    fun ladder() {
        println("лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class Cargo1(
    override val name: String,
    override val speed: Int,
    override val capacity: Int,
) : Liner1(name, speed, capacity) {
    fun loadingCrane() {
        println("грузовой корабль активирует погрузочный кран")
    }
}

class Icebreaker1(
    override val name: String,
    override val speed: Int,
    override val capacity: Int,
) : Liner1(name, speed, capacity) {
    fun chopTheIce() {
        println("Херачу лёд хоть я каменщик и работаю 3 дня")
    }

    fun openGate() {
        println("ледокол открывает ворота со стороны кормы")
    }
}

fun main() {
    val liner = Liner1("Лайнер", 500, 1000)
    val cargo = Cargo1("Грузовой", 250, 1200)
    val icebreaker = Icebreaker1("Ледокол", 200, 750)
    liner.printInfo()
    liner.ladder()
    cargo.printInfo()
    cargo.loadingCrane()
    icebreaker.printInfo()
    icebreaker.openGate()
    icebreaker.chopTheIce()
}