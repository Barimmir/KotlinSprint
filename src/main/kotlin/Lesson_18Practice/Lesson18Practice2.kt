package org.example.Lesson_18Practice

abstract class Dice(
    open val facets: Int,
) {
    open fun trowADice() {
        println("Выпало ${(MIN_FACETS..facets).random()}")
    }
}

class Dice4(
    override val facets: Int = 4,
) : Dice(facets) {
    override fun trowADice() {
        super.trowADice()
    }
}

class Dice6(
    override val facets: Int = 6,
) : Dice(facets) {
    override fun trowADice() {
        super.trowADice()
    }
}

class Dice8(
    override val facets: Int = 8,
) : Dice(facets) {
    override fun trowADice() {
        super.trowADice()
    }
}

fun main() {
    val listDice = listOf(Dice4(), Dice6(), Dice8())
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()
    listDice.forEach { it.trowADice() }
}

const val MIN_FACETS = 1