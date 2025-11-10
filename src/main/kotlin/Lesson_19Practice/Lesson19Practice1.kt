package org.example.Lesson_19Practice

enum class Fish10() {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun getFish(fish: Fish10) {
    when (fish) {
        Fish10.GUPPY -> println("Гуппи")
        Fish10.ANGELFISH -> println("Скалярия")
        Fish10.GOLDFISH -> println("Золотая рыбка")
        Fish10.SIAMESE_FIGHTING_FISH -> println("Петушок")
    }
}

fun main() {
    val fish = listOf(1, 2, 3, 4)
    println("Этих рыбок можно добавить в аквариум:")
    for (i in fish) {
        when (i) {
            1 -> getFish(Fish10.GUPPY)
            2 -> getFish(Fish10.ANGELFISH)
            3 -> getFish(Fish10.GOLDFISH)
            4 -> getFish(Fish10.SIAMESE_FIGHTING_FISH)
        }
    }
}