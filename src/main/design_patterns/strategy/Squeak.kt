package main.design_patterns.strategy

import main.design_patterns.strategy.behaviour.QuackBehaviour

/**
 * Created by johannesC on 2019/02/27.
 */
class Squeak : QuackBehaviour {

    override fun quack() {
        println("Squeak!!!")
    }
}