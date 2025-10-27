package org.example.Lesson_15Practice

open class General(
    open val name: String,
    open val quantity: String,
) {
    open fun printInfo() {
        println(
            "Название: $name\n" +
                    "Количество: $quantity"
        )
    }
}

class MusicalInstruments(
    override val name: String,
    override val quantity: String,
    val accessoriesList: MutableList<Accessories> = mutableListOf()
) : General(name, quantity)

class Accessories(
    override val name: String,
    override val quantity: String,
) : General(name, quantity)

interface Search {
    fun simulatesSearch() {
        println("Выполняется поиск...")
    }

    fun printAccessories(musicalInstruments: MusicalInstruments) {
        val nameInstruments = musicalInstruments.name
        val accessoriesList = musicalInstruments.accessoriesList
        println("Компоненты для инструмента $nameInstruments: ${accessoriesList.joinToString { "${it.name}: ${it.quantity} шт" }}")
    }
}

class SearchData : Search

fun main() {
    val search = SearchData()
    val instruments1 = MusicalInstruments("Гитара акустическая", "3 шт")
    val accessories1 = Accessories("Медатор", "30")
    val accessories2 = Accessories("Каподастр", "9")
    val accessories3 = Accessories("Комплект струн", "14")
    instruments1.accessoriesList.add(accessories1)
    instruments1.accessoriesList.add(accessories2)
    instruments1.accessoriesList.add(accessories3)
    instruments1.printInfo()
    search.simulatesSearch()
    search.printAccessories(instruments1)
}