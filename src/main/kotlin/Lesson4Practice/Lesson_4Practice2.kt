package org.example.Lesson4Practice

fun main() {

    val baggageKilograms1 = 20
    val baggageLiters1 = 80
    val baggageKilograms2 = 50
    val baggageLiters2 = 100
    val chek: Boolean = (MIN_KILOGRAMS < baggageKilograms1) && (baggageKilograms1 < MIN_KILOGRAMS)
            && (MIN_LITERS < baggageLiters1) && (baggageLiters1 < MAX_LITERS)
    val chek2: Boolean = (MIN_KILOGRAMS < baggageKilograms2) && (baggageKilograms2 < MAX_KILOGRAMS)
            && (MIN_LITERS < baggageLiters2) && (baggageLiters2 < MAX_LITERS)

    println(
        "Груз с весом $baggageKilograms1 кг и объемом $baggageLiters1 л " +
                "соответствует категории 'Average':$chek"
    )
    println(
        "Груз с весом $baggageKilograms2 кг и объемом $baggageLiters2 л " +
                "соответствует категории 'Average':$chek2"
    )

}

const val MIN_KILOGRAMS = 35
const val MAX_KILOGRAMS = 100
const val MIN_LITERS = 0
const val MAX_LITERS = 100

