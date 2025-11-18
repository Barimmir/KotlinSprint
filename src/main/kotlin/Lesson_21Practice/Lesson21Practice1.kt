package org.example.Lesson_21Practice

fun String.vowelCount(): Int {
    val listVowels = setOf('e', 'y', 'u', 'i', 'o', 'a')
    return this.count { it in listVowels }
}

fun main() {
    println("Hello".vowelCount())
}