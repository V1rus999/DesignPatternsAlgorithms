package main.design_patterns.decorator

/**
 * Created by johannesC on 2019/03/05.
 */
abstract class BeverageExtras : Beverage() {
    abstract override fun getDescription(): String
}