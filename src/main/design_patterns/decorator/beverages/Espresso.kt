package main.design_patterns.decorator.beverages

import main.design_patterns.decorator.Beverage

/**
 * Created by johannesC on 2019/03/05.
 */
class Espresso : Beverage() {

    override fun getDescription() : String = "Espresso"

    override fun cost(): Double = 30.0
}