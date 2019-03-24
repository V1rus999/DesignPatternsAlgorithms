package main.design_patterns.decorator.beverages

import main.design_patterns.decorator.Beverage

/**
 * Created by johannesC on 2019/03/05.
 */
class FlatWhite : Beverage() {

    override fun getDescription() : String = "Flat White"

    override fun cost(): Double = 35.0

}