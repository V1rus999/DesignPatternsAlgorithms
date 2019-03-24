package main.design_patterns.observer

import main.design_patterns.observer.subjects.CurrentConditionsDisplay
import main.design_patterns.observer.subjects.PressureDisplay

/**
 * Created by johannesC on 2019/02/28.
 */
fun main(args : Array<String>) {
    val weatherData = WeatherData()
    CurrentConditionsDisplay(weatherData)
    weatherData.onNewMeasurements(50F,5F,5.0F)
    weatherData.onNewMeasurements(60F,65F,6.0F)
    PressureDisplay(weatherData)
    weatherData.onNewMeasurements(70F,75F,7.0F)
}