package org.example.Lesson_15Practice

open class Passengers(
    open val name: String,
)

open class Cargo(
    open val name: String,
)

interface Transportation {
    fun drive() {}
    fun brake() {}
    fun stop() {}
}

interface CargoTransportation {
    fun loadingCargo(cargo: Cargo) {}
    fun unloadingCargo(cargo: Cargo) {}
}

interface PassengerTransportation {
    fun loadingPassengers(passengers: Passengers) {}
    fun unloadingPassengers(passengers: Passengers) {}
}

open class Car(
    open val name: String,
    open val passengers: Int,
) : Transportation, PassengerTransportation {
    open val passengersList = mutableListOf<Passengers>()
    override fun drive() {
        println("$name  едет")
    }

    override fun brake() {
        println("$name тормозит")
    }

    override fun stop() {
        println("$name останавливается")
    }

    override fun loadingPassengers(passengers: Passengers) {
        if (passengersList.size < MAX_PASSENGERS_IN_CAR) {
            passengersList.add(passengers)
            println("Пассажир ${passengers.name} сел в машину")
        } else {
            println("Свободных мест в машине не осталось")
        }
    }

    override fun unloadingPassengers(passengers: Passengers) {
        if (passengersList.size > MIN_PASSENGERS_IN_CAR) {
            passengersList.remove(passengers)
            println("Пассажир ${passengers.name} вышел из машины")
        } else {
            println("В машине не осталось пассажиров")
        }
    }
}

class Truck(
    override val name: String,
    override val passengers: Int,
    val cargo: Int,
) : Car(name, passengers), Transportation, CargoTransportation, PassengerTransportation {
    private val cargoList = mutableListOf<Cargo>()
    override fun drive() {
        println("$name  едет")
    }

    override fun brake() {
        println("$name тормозит")
    }

    override fun stop() {
        println("$name останавливается")
    }

    override fun loadingPassengers(passengers: Passengers) {
        if (passengersList.size < MAX_PASSENGERS_IN_TRUCK) {
            passengersList.add(passengers)
            println("Пассажир ${passengers.name} сел в машину")
        } else {
            println("Свободных мест в машине не осталось")
        }
    }

    override fun unloadingPassengers(passengers: Passengers) {
        if (passengersList.size > MIN_PASSENGERS_IN_CAR) {
            passengersList.remove(passengers)
            println("Пассажир ${passengers.name} вышел из машины")
        } else {
            println("В машине не осталось пассажиров")
        }
    }

    override fun loadingCargo(cargo: Cargo) {
        if (cargoList.size < MAX_CARGO_IN_TRUCK) {
            cargoList.add(cargo)
            println("Груз ${cargo.name} добавлен")
        } else {
            println("Места для груза нет")
        }
    }

    override fun unloadingCargo(cargo: Cargo) {
        if (cargoList.size > MIN_CARGO_IN_TRUCK) {
            cargoList.remove(cargo)
            println("Груз ${cargo.name} выгружен")
        } else {
            println("В машине не осталось груза")
        }
    }
}

fun main() {
    val parasha = mutableListOf<Any>()
    val car = Car("Приора", 3)
    val truck = Truck("Катафалк", 1, 2)
    val cargo1 = Cargo("Плойка 1")
    val cargo2 = Cargo("Икс бокс")
    val passenger1 = Passengers("Вася")
    val passenger2 = Passengers("Валя")
    val passenger3 = Passengers("Маля")
    val passenger4 = Passengers("Шмаля")
    val passenger5 = Passengers("Фраля")
    val passenger6 = Passengers("Паля")
    car.loadingPassengers(passenger1)
    car.loadingPassengers(passenger2)
    car.loadingPassengers(passenger3)
    truck.loadingPassengers(passenger4)
    truck.loadingCargo(cargo1)
    truck.loadingCargo(cargo2)
    car.drive()
    truck.drive()
    car.brake()
    truck.brake()
    car.stop()
    truck.stop()
    car.unloadingPassengers(passenger1)
    parasha.add(passenger1)
    car.unloadingPassengers(passenger2)
    parasha.add(passenger2)
    car.unloadingPassengers(passenger3)
    parasha.add(passenger3)
    truck.unloadingPassengers(passenger4)
    parasha.add(passenger4)
    truck.unloadingCargo(cargo1)
    parasha.add(cargo1)
    truck.unloadingCargo(cargo2)
    parasha.add(cargo2)
    car.drive()
    car.brake()
    car.stop()
    car.loadingPassengers(passenger5)
    car.loadingPassengers(passenger6)
    car.drive()
    car.brake()
    car.stop()
    car.unloadingPassengers(passenger5)
    parasha.add(passenger5)
    car.unloadingPassengers(passenger6)
    parasha.add(passenger6)
}

const val MAX_PASSENGERS_IN_CAR = 3
const val MIN_PASSENGERS_IN_CAR = 0
const val MAX_PASSENGERS_IN_TRUCK = 1
const val MAX_CARGO_IN_TRUCK = 2
const val MIN_CARGO_IN_TRUCK = 0
