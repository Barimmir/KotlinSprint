package org.example.Lesson_12Practice

import kotlin.random.Random

class WeatherDay5(kelvinDayTemperature: Int, kelvinNightTemperature: Int, isPrecipitation: Boolean) {
    val celsiusDayTemperature = (kelvinDayTemperature - CONVERTING_KELVIN_TO_CELSIUS3).toInt()
    val celsiusNightTemperature = (kelvinNightTemperature - CONVERTING_KELVIN_TO_CELSIUS3).toInt()
    val isPrecipitation = isPrecipitation
}

fun main() {
    val dataForTheMonth = List<WeatherDay5>(MAX_DAY_IN_MONTH) {
        WeatherDay5(
            kelvinDayTemperature = (184..329).random(),
            kelvinNightTemperature = (184..329).random(),
            isPrecipitation = Random.nextBoolean(),
        )
    }

    val dayTemperatureInMonthList = dataForTheMonth.map { it.celsiusDayTemperature }
    val nightTemperatureInMonthList = dataForTheMonth.map { it.celsiusNightTemperature }
    val isPrecipitationInMonthList = dataForTheMonth.map { it.isPrecipitation }
    val averageMonthTemperatureDay = dayTemperatureInMonthList.average().toInt()
    val averageMonthTemperatureNight = nightTemperatureInMonthList.average().toInt()
    val daysPrecipitation = isPrecipitationInMonthList.count { it }
    println(
        "Среднее значение температуры днём за месяц: $averageMonthTemperatureDay\n" +
                "\"Среднее значение температуры ночью за месяц: $averageMonthTemperatureNight\n" +
                "Дней с осадками: $daysPrecipitation"
    )
}

const val CONVERTING_KELVIN_TO_CELSIUS3 = 273.15
const val MAX_DAY_IN_MONTH = 30