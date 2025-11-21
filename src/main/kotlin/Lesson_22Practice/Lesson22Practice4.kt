package org.example.Lesson_22Practice

data class MainScreenState(
    val data: String? = "Отсутствие данных",
    val isLoading: Boolean = false,
)
class MainScreenViewModel() {
    var mainScreenState: MainScreenState = MainScreenState()
    fun loadData() {
        println(
            "Состояние: $mainScreenState"
        )
        println("Состояние: $mainScreenState")
        mainScreenState = mainScreenState.copy(data = "Загрузка данных", isLoading = true)
        println(
            "Состояние: $mainScreenState"
        )
        println("Состояние: $mainScreenState")
        mainScreenState = mainScreenState.copy(data = "Данные успешно загружены", isLoading = false)
        println(
            "Состояние: $mainScreenState"
        )
        println("Состояние: $mainScreenState")
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}