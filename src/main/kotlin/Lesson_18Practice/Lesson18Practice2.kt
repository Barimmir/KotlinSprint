package org.example.Lesson_18Practice

abstract class Dice(
    open val facets: Int,
) {
    fun trowADice() {
        println("Выпало ${(MIN_FACETS..facets).random()}")
    }
}

class Dice4(
    override val facets: Int = 4,
) : Dice(facets)

class Dice6(
    override val facets: Int = 6,
) : Dice(facets)

class Dice8(
    override val facets: Int = 8,
) : Dice(facets)

fun main() {
    val listDice = listOf(Dice4(), Dice6(), Dice8())
    listDice.forEach { it.trowADice() }
}

const val MIN_FACETS = 1