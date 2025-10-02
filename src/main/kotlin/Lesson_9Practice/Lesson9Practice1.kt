package org.example.Lesson_9Practice

fun main() {
    val list = listOf("мясо", "грибы", "булки","соус", "овощи")
    println("В рецепте есть следущие ингредиенты: \n${list.joinToString("\n")}")
}