package org.example.Lesson_15Practice

interface Flying {
    fun preparingToTakeOf()
    fun takingOff()
    fun landing()
}

interface Floating {
    fun startToSwim()
    fun stops()
}

abstract class Animal {
    abstract val name: String
}

class CrucianCarp(
    override val name: String,
) : Animal(), Floating {
    override fun startToSwim() {
        println("$name плывёт")
    }

    override fun stops() {
        println("$name останавливаетя")
    }
}

class Seagull(
    override val name: String,
) : Animal(), Flying {
    override fun preparingToTakeOf() {
        println("$name готовится взлететь")
    }

    override fun takingOff() {
        println("$name летит")
    }

    override fun landing() {
        println("$name приземляется")
    }
}

class Duck(
    override val name: String,
) : Animal(), Flying {
    override fun preparingToTakeOf() {
        println("$name готовится взлететь")
    }

    override fun takingOff() {
        println("$name летит")
    }

    override fun landing() {
        println("$name приземляется")
    }
}

fun main() {
    val crucianCarp = CrucianCarp("Карась")
    val seagull = Seagull("Чайка")
    val duck = Duck("Утка")
    crucianCarp.startToSwim()
    crucianCarp.stops()
    seagull.preparingToTakeOf()
    seagull.takingOff()
    seagull.landing()
    duck.preparingToTakeOf()
    duck.takingOff()
    duck.landing()
}

