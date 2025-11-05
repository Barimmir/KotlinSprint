package org.example.Lesson_17Practice

class Folder(
    name: String,
    numberOfFiles: Int,
    private val flag: Boolean
) {

    var name: String = name
        get() =
            if (flag) {
                "Скрытая папка"
            } else {
                field
            }

    var numberOfFiles: Int = numberOfFiles
        get() = if (flag) 0 else field
}

fun main() {
    val folder = Folder("Секретно", 3, true)
    println(folder.name)
    println(folder.numberOfFiles)
}
