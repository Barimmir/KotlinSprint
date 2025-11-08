package org.example.Lesson_18Practice

abstract class Animal(
    open val animal: String,
    open val eat: String
) {
    open fun eat(): String {
        return "$animal ест -> $eat"
    }

    open fun sleep(): String {
        return "$animal спит"
    }
}

class Fox(
    override val animal: String = "Лиса",
    override val eat: String = "ягоды",
) : Animal(animal, eat) {
    override fun eat(): String {
        return super.eat()
    }

    override fun sleep(): String {
        return super.sleep()
    }
}

class Dog(
    override val animal: String = "Собака",
    override val eat: String = "кости",
) : Animal(animal, eat) {
    override fun eat(): String {
        return super.eat()
    }

    override fun sleep(): String {
        return super.sleep()
    }
}

class Cat(
    override val animal: String = "Кошка",
    override val eat: String = "рыбу",
) : Animal(animal, eat) {
    override fun eat(): String {
        return super.eat()
    }

    override fun sleep(): String {
        return super.sleep()
    }
}

fun main() {
    val listAnimal = mutableListOf<Animal>()
    val dog = Dog()
    val fox = Fox()
    val cat = Cat()
    listAnimal.add(dog)
    listAnimal.add(fox)
    listAnimal.add(cat)
    listAnimal.forEach { println(it.eat()) }
    listAnimal.forEach { println(it.sleep()) }
}