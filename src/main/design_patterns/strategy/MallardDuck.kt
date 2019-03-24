package main.design_patterns.strategy

import main.design_patterns.strategy.behaviour.FlyWithWings
import main.design_patterns.strategy.behaviour.Quack

/**
 * Created by johannesC on 2019/02/27.
 */
class MallardDuck() : Duck(FlyWithWings(), Quack()) {

    override fun display() {
        println("Im a ${this::class.simpleName}")
    }

}