package org.example.Lesson_9Practice

fun main() {
    val ingredients = listOf("мясо", "грибы", "булки","соус", "овощи")
    println("В рецепте есть следущие ингредиенты: \n${ingredients.joinToString("\n")}")
}