package org.example.Lesson_22Practice

data class Animal5(
    val nameAnimal: String,
    val age: Int,
    val wild: Boolean,
)

fun main() {
    val animal = Animal5("Кот Василий", 9, false)
    val (nameAnimal, age, wild) = animal
    println(nameAnimal)
    println(age)
    println(wild)
}