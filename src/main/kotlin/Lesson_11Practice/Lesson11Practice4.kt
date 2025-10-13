package org.example.Lesson_11Practice

class RecipeCategory(
    val id: Int,
    val nameCategory: String,
    val description: String,
    val imageUrl: String,
)

class Ingredient(
    val id: Int,
    val name: String,
    val quantity: Int,
    val units: String,
)

class Recipe(
    val id: Int,
    val categoryId: Int,
    val imageUrl: String,
    val name: String,
    val description: String,
    val ingredients: List<Ingredient>,
    val cooking : String,
)