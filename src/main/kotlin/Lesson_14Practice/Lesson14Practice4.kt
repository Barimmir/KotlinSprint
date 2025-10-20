package org.example.Lesson_14Practice

open class CelestialBody(
    open val name: String,
    open val atmosphere: Boolean,
    open val landingSuitability: Boolean,
)

class Planet(
    override val name: String,
    override val atmosphere: Boolean,
    override val landingSuitability: Boolean,
    val listSatellite: MutableList<Satellite>,

) : CelestialBody(name, atmosphere, landingSuitability){
    fun printSatellite(){
        listSatellite.forEach { satellite -> println(satellite.name) }
    }
}

class Satellite(
    override val name: String,
    override val atmosphere: Boolean,
    override val landingSuitability: Boolean,
) : CelestialBody(name, atmosphere, landingSuitability)

fun main() {
    val planet1 = Planet(
        "Пивандрия", true, true,
        mutableListOf()
    )
    val satellite1 = Satellite(
        "Дотная",
        false, true
    )
    val satellite2 = Satellite(
        "Ксная",
        true, true
    )
    planet1.listSatellite.add(satellite1)
    planet1.listSatellite.add(satellite2)
    println(planet1.name)
    planet1.printSatellite()
}