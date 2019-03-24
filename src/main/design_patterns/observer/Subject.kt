package main.design_patterns.observer

/**
 * Created by johannesC on 2019/02/28.
 */
interface Subject<T> {

    fun registerObserver(observer: T)

    fun removeObserver(observer: T)

    fun notifyObservers()
}