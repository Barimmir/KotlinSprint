package org.example.Lesson_19Practice

class Spaceship(
    val nameShip: String,
) {
    fun takeOff() {
        println("Корабль $nameShip взлетает")
    }

    fun landing() {
        TODO("Добавь логику,дураааашка")
    }

    fun shootAsteroid() {
        //TODO Добавить логику стрельбы
        println("Корабль $nameShip стреляет в астероиды")
    }
}

fun main() {
    val ship = Spaceship("Попадос")
    ship.takeOff()
    ship.shootAsteroid()
    ship.landing()
}