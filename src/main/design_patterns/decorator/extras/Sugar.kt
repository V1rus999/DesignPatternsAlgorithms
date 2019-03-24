package main.design_patterns.decorator.extras

import main.design_patterns.decorator.Beverage
import main.design_patterns.decorator.BeverageExtras

/**
 * Created by johannesC on 2019/03/05.
 */
class Sugar(private val beverage: Beverage) : BeverageExtras() {

    override fun getDescription(): String = "${beverage.getDescription()} , Sugar"

    override fun cost(): Double = beverage.cost() + 1.1
}