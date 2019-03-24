package main.design_patterns.decorator.extras

import main.design_patterns.decorator.Beverage
import main.design_patterns.decorator.BeverageExtras

/**
 * Created by johannesC on 2019/03/05.
 */
class Milk(private val beverage: Beverage) : BeverageExtras() {

    override fun getDescription(): String = "${beverage.getDescription()} , Milk"

    override fun cost(): Double = beverage.cost() + 5.30
}