package main.design_patterns.strategy

import main.design_patterns.strategy.behaviour.FlyNoWay
import main.design_patterns.strategy.behaviour.Quack

/**
 * Created by johannesC on 2019/02/27.
 */
class ModelDuck : Duck(FlyNoWay(), Quack()) {

    override fun display() {
        println("Im a ${this::class.simpleName}")
    }
}