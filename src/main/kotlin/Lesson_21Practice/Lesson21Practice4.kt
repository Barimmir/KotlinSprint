package org.example.Lesson_21Practice

import java.io.File

fun File.writeToFileAndSend(word: String) {
    val message = this.readText()
    val addText = word.lowercase() + " "
    this.writeText(addText + message)
}

fun main() {
    val file = File("Soso.txt")
    file.writeToFileAndSend("Popi")
    file.writeToFileAndSend("Fopi")
    file.writeToFileAndSend("Dopi")
    print(file.readText())
}