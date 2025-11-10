package org.example.Lesson_19Practice

enum class Fish10(val fishNumber: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалария"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {
    println("Этих рыбок можно добавить в аквариум:")
    for (i in Fish10.entries) {
        println(i.fishNumber)
    }
}
