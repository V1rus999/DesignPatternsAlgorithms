package main.design_patterns.observer.subjects

import main.design_patterns.observer.Subject
import main.design_patterns.observer.WeatherObserver

/**
 * Created by johannesC on 2019/02/28.
 */
class CurrentConditionsDisplay(weatherSubject: Subject<WeatherObserver>) : WeatherObserver {

    init {
        weatherSubject.registerObserver(this)
    }

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        println("Current Conditions $temperature degrees C $humidity % humidity")
    }
}