package org.example.Lesson_19Practice

enum class Fish10(val fishName: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалария"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок")
}

fun main() {
    println("Этих рыбок можно добавить в аквариум:")
    Fish10.entries.forEach { println(it.fishName) }
}
