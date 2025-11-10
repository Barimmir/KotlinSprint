package org.example.Lesson_19Practice

enum class Category {
    CLOTHING,
    STATIONERY,
    OTHER;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHING -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            OTHER -> "Разное"
        }
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun printInfo() {
        println(
            "Товар: $name\n" +
                    "id: $id\n" +
                    "Категория: ${category.getCategoryName()}"
        )
    }
}

fun main() {
    val listProduct = listOf(
        Product("Куртка", 2, Category.CLOTHING),
        Product("Ручка", 2, Category.STATIONERY),
        Product("НЛО", 2, Category.OTHER),
        Product("Юбка", 2, Category.CLOTHING),
        Product("Катана", 2, Category.OTHER)
    )
    listProduct.forEach { it.printInfo() }
}