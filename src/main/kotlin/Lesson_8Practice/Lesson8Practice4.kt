package org.example.Lesson_8Practice

fun main() {
    val arrayOfIngredients = arrayOf("хлеб", "колбаса", "сыр", "кетчуп")
    println(
        "Список ингредиентов: ${arrayOfIngredients.joinToString()}\n" +
                "Какой вы бы хотели заменить?"
    )
    val deleteIngredients = readln()

    if (deleteIngredients in arrayOfIngredients) {
        println("На какой ингредиент вы бы хотели заменить?")
        val newIngredients = readln()

        val index = arrayOfIngredients.indexOf(deleteIngredients)
        arrayOfIngredients[index] = newIngredients

        println(arrayOfIngredients.joinToString())
    } else {
        println("Введите ингредиент который есть в списке")
    }

}