package main.design_patterns.observer

/**
 * Created by johannesC on 2019/02/28.
 */
interface WeatherObserver {

    fun update(temperature: Float, humidity: Float, pressure: Float)
}