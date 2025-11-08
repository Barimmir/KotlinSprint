package org.example.Lesson_18Practice

abstract class Dice(
    open val facets: Int,
) {
    open fun trowADice() = ""
}

class Dice4(
    override val facets: Int = 4,
) : Dice(facets) {
    override fun trowADice(): String {
        return "Выпало: ${(MIN_FACETS..facets).random()}"
    }
}

class Dice6(
    override val facets: Int = 6,
) : Dice(facets) {
    override fun trowADice(): String {
        return "Выпало: ${(MIN_FACETS..facets).random()}"
    }
}

class Dice8(
    override val facets: Int = 8,
) : Dice(facets) {
    override fun trowADice(): String {
        return "Выпало: ${(MIN_FACETS..facets).random()}"
    }
}

fun main() {
    val listDice = mutableListOf<Dice>()
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()
    listDice.add(dice4)
    listDice.add(dice6)
    listDice.add(dice8)
    listDice.forEach { println(it.trowADice()) }
}

const val MIN_FACETS = 1