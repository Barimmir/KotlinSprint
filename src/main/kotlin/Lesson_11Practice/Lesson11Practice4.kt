package org.example.Lesson_11Practice

class RecipeCategory(
    val id: Int,
    val nameCategory: String,
    val description: String,
)

class Ingredients(
    val id: Int,
    val name: String,
)

class Recipe(
    val id: Int,
    val categoryId: Int,
    val name: String,
    val description: String,
    val ingredients: List<Ingredients>
)

class DataManager {
    private val categories = mutableListOf<RecipeCategory>()
    private val recipes = mutableListOf<Recipe>()

    fun addCategory(category: RecipeCategory) {
        categories.add(category)
    }

    fun addRecipe(recipe: Recipe) {
        recipes.add(recipe)
    }

    fun getCategories(): List<RecipeCategory> = categories.toList()
    fun getRecipe(): List<Recipe> = recipes.toList()
}

fun main() {
    val dataManager = DataManager()
    val burgerCategory = RecipeCategory(
        id = 1,
        nameCategory = "Бургеры",
        description = "Рецепты всех популярных видов бургеров",
    )
    val desertCategory = RecipeCategory(
        id = 2,
        nameCategory = "Десерты",
        description = "Самые вкусные рецепты десертов для вас",
    )
    val pizzaCategory = RecipeCategory(
        id = 3,
        nameCategory = "Пицца",
        description = "Пицца на любой вкус и цвет",
    )
    val fishCategory = RecipeCategory(
        id = 4,
        nameCategory = "Рыба",
        description = "Любая рыба на ваш вкус",
    )
    dataManager.addCategory(burgerCategory)
    dataManager.addCategory(desertCategory)
    dataManager.addCategory(pizzaCategory)
    dataManager.addCategory(fishCategory)

    val ingredientsOfClassicBurger = listOf(
        Ingredients(1, "Булочка"),
        Ingredients(2, "Котлета"),
        Ingredients(3, "Помидор"),
        Ingredients(4, "Салат"),
        Ingredients(5, "Соус"),
    )
    val classicBurger = Recipe(
        id = 1,
        categoryId = 1,
        name = "Классический бургер",
        description = "Это классика! Это знать надо!",
        ingredients = ingredientsOfClassicBurger
    )
    dataManager.addRecipe(classicBurger)
    println("===Главный экран===")
    println("===Категории===")
    dataManager.getCategories().forEach { category ->
        println("${category.id}) ${category.nameCategory} - ${category.description}")
    }
    println("Клик по категории ${burgerCategory.nameCategory}")
    dataManager.getRecipe().forEach { recipe ->
        println("${recipe.id}.${recipe.categoryId}) ${recipe.name} - ${recipe.description}")
    }
    println("Клик по ${classicBurger.name}")
    classicBurger.ingredients.forEach { ingredients ->
        println("${ingredients.id}) ${ingredients.name}")
    }
}
