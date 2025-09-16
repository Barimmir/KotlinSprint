package org.example.Lesson_2Practice

import kotlin.math.pow

fun main() {

    var amount = 70000
    val rate = 16.7f / 100
    val year = 20f
    val formula= amount * (1 + rate).pow(year)
    val result = "%.3f".format(formula)

    print(result)
}