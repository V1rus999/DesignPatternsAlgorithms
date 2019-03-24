package main.design_patterns.observer

/**
 * Created by johannesC on 2019/02/28.
 */
class WeatherData : Subject<WeatherObserver> {

    private val observerList: MutableList<WeatherObserver> = mutableListOf()
    private lateinit var weatherReadings: WeatherReading

    override fun registerObserver(observer: WeatherObserver) {
        if (!observerList.contains(observer)) {
            observerList.add(observer)
        }
    }

    override fun removeObserver(observer: WeatherObserver) {
        if (observerList.contains(observer)) {
            observerList.remove(observer)
        }
    }

    override fun notifyObservers() {
        observerList.forEach {
            it.update(weatherReadings.temperature, weatherReadings.humidity, weatherReadings.pressure)
        }
    }

    fun onNewMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        weatherReadings = WeatherReading(temperature, humidity, pressure)
        notifyObservers()
    }

    private data class WeatherReading(val temperature: Float,
                                      val humidity: Float,
                                      val pressure: Float)
}