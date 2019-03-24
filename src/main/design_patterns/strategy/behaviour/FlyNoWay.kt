package main.design_patterns.strategy.behaviour

/**
 * Created by johannesC on 2019/02/27.
 */
class FlyNoWay : FlyBehaviour {

    override fun fly() {
        println("I can't fly")
    }
}