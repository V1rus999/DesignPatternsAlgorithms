package main.design_patterns.decorator

/**
 * Created by johannesC on 2019/03/05.
 */
abstract class Beverage {

    open fun getDescription() : String = "Unknown Beverage"

    abstract fun cost(): Double
}