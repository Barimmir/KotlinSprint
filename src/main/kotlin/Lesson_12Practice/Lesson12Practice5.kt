package org.example.Lesson_12Practice

import kotlin.random.Random

class WeatherDay5(kelvinDayTemperature: Int, kelvinNightTemperature: Int, isPrecipitation: Boolean) {
    val celsiusDayTemperature = (kelvinDayTemperature - CONVERTING_KELVIN_TO_CELSIUS3).toInt()
    val celsiusNightTemperature = (kelvinNightTemperature - CONVERTING_KELVIN_TO_CELSIUS3).toInt()
    val isPrecipitation = isPrecipitation
}

fun main() {
    val dataForTheMonth = mutableListOf<Triple<Int, Int, Boolean>>()
    for (it in 1..30) {
        val day = WeatherDay5(
            kelvinDayTemperature = (184..329).random(),
            kelvinNightTemperature = (184..329).random(),
            isPrecipitation = Random.nextBoolean(),

            )
        dataForTheMonth.add(
            Triple(
                day.celsiusDayTemperature,
                day.celsiusNightTemperature,
                day.isPrecipitation,
            )
        )
    }
    val dayTemperatureInMonthList = dataForTheMonth.map { it.first }
    val nightTemperatureInMonthList = dataForTheMonth.map { it.second }
    val isPrecipitationInMonthList = dataForTheMonth.map { it.third }
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