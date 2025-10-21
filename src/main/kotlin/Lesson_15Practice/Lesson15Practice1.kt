package org.example.Lesson_15Practice

interface Flying {
    fun walks() {
        println("Важно ходит")
    }

    fun stops() {
        println("Останаливается и думает о вечном")
    }

    fun preparingToTakeOf() {
        println("Готовится взмахнуть в небо")
    }

    fun takingOff() {
        println("Взмахнула и летит")
    }

    fun landing() {
        println("Приземляется")
    }
}

interface Floating {
    fun startToSwim() {
        println("Начинает плыть")
    }

    fun stops() {
        println("Останавливается")
    }
}

abstract class Animal {
    abstract val name: String
}

class CrucianCarp(
    override val name: String,
) : Animal(), Floating

class Seagull(
    override val name: String,
) : Animal(), Flying

class Duck(
    override val name: String,
) : Animal(), Flying

fun main() {
    val crucianCarp = CrucianCarp("Карась")
    val seagull = Seagull("Чайка")
    val duck = Duck("Утка")
    println(crucianCarp.name)
    crucianCarp.startToSwim()
    crucianCarp.stops()
    println(seagull.name)
    seagull.preparingToTakeOf()
    seagull.takingOff()
    seagull.landing()
    println(duck.name)
    duck.walks()
    duck.stops()
}

