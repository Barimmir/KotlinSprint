package org.example.Lesson_17Practice

class Parcel(
    val number: Int,
    location: String,
) {
    var moveCounter: Int = 0
    var location: String = location
        set(value) {
            if (field != value) {
                moveCounter++
                println("Послыка $number: прибыла из $field в $value")
            }
            field = value
        }

}

fun main() {
    val parcel = Parcel(9,"Питер")
    parcel.location = "Москва"
    println(parcel.moveCounter)
    parcel.location = "Сочи"
    println(parcel.moveCounter)
}