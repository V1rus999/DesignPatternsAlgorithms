package main.design_patterns.strategy

import main.design_patterns.strategy.behaviour.FlyBehaviour
import main.design_patterns.strategy.behaviour.QuackBehaviour

/**
 * Created by johannesC on 2019/02/27.
 */
//Prefer composition above inheritance. Its easier to manage behavioural changes.
abstract class Duck constructor(private var flyBehaviour: FlyBehaviour, private var quackBehaviour: QuackBehaviour) {

    abstract fun display()

    fun performQuack() {
        quackBehaviour.quack()
    }

    fun performFly() {
        flyBehaviour.fly()
    }

    fun setFlyBehaviour(flyBehaviour: FlyBehaviour) {
        this.flyBehaviour = flyBehaviour
    }

    fun setQuackBehaviour(quackBehaviour: QuackBehaviour) {
        this.quackBehaviour = quackBehaviour
    }
}