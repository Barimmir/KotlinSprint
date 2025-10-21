package org.example.Lesson_15Practice

abstract class WeatherStationStats(
    open val time: String,
    open val location: String,
) {
    abstract fun getData(): String
}

class Temperature(
    override val time: String,
    override val location: String,
    val temperature: Int,
) : WeatherStationStats(time, location) {
    override fun getData(): String {
        return "Температура: $temperature"
    }

    fun giveRating(): String {
        return when {
            temperature < 0 -> "Мороз"
            temperature < 10 -> "Прохладно"
            temperature < 20 -> "Тепло"
            else -> "Жарко"
        }
    }
}

class PrecipitationAmount(
    override val time: String,
    override val location: String,
    val precipitation: Boolean,
) : WeatherStationStats(time, location) {
    override fun getData(): String {
        return "Осадки: $precipitation"
    }

    fun giveRating(): String {
        return when {
            precipitation == true -> "Есть"
            else -> "Отсутствуют"
        }
    }
}

class WeatherServer {
    fun sendData(data: WeatherStationStats) {
        println(
            "Время отправки: ${data.time}\n" +
                    "Локация: ${data.location}\n" +
                    "Данные: ${data.getData()}"
        )
        when (data) {
            is Temperature -> println("Описание: ${data.giveRating()} ")
            is PrecipitationAmount -> println("Описание: ${data.giveRating()}")
        }
    }

}

fun main() {
    val weatherServer = WeatherServer()
    val temperatureData1 = Temperature("19:00", "Москва", -5)
    val temperatureData2 = Temperature("15:00", "Питер", 15)
    val precipitationData1 = PrecipitationAmount("13:00", "Оригммар", true)
    val precipitationData2 = PrecipitationAmount("23:00", "Штормград", false)

    weatherServer.sendData(temperatureData1)
    weatherServer.sendData(temperatureData2)
    weatherServer.sendData(precipitationData1)
    weatherServer.sendData(precipitationData2)
}