package org.example.Lesson_18Practice

open class Dice() {
    open fun trowADice() = ""
}

class Dice4(
    private val facets: Int,
) : Dice() {
    override fun trowADice(): String {
        return "Выпало: ${(MIN_FACETS..facets).random()}"
    }
}

class Dice6(
    private val facets: Int,
) : Dice() {
    override fun trowADice(): String {
        return "Выпало: ${(MIN_FACETS..facets).random()}"
    }
}

class Dice8(
    private val facets: Int
) : Dice() {
    override fun trowADice(): String {
        return "Выпало: ${(MIN_FACETS..facets).random()}"
    }
}

fun main() {
    val listDice = mutableListOf<Dice>()
    val dice4 = Dice4(4)
    val dice6 = Dice6(6)
    val dice8 = Dice8(8)
    listDice.add(dice4)
    listDice.add(dice6)
    listDice.add(dice8)
    listDice.forEach { println(it.trowADice()) }
}

const val MIN_FACETS = 1