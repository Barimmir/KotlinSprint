package org.example.Lesson_9Practice

fun main() {
    val amountForOneDish = listOf(2, 50, 15)
    println("Введиет требуемое количество порций:")
    val userInputNumberOfServing = readln().toInt()

    val amountForDishUser = amountForOneDish.map {
        it * userInputNumberOfServing
    }
    println(
        "На $userInputNumberOfServing порций вам понадобится понадобится:\n" +
                "Яиц-${amountForDishUser[0]},молока-${amountForDishUser[1]},сливочного масла-${amountForDishUser[2]} "
    )
}