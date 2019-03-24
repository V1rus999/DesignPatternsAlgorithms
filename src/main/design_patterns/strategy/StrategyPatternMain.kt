package main.design_patterns.strategy

import main.design_patterns.strategy.behaviour.FlyWithWings

/**
 * Created by johannesC on 2019/02/27.
 */

/**
 * The strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.
 * This means you should prefer composition over inheritance.
 */
fun main(args: Array<String>) {
    val duck = MallardDuck()
    duck.display()
    duck.performFly()
    duck.performQuack()

    println("===============")

    val modelDuck = ModelDuck()
    modelDuck.display()
    modelDuck.performFly()
    modelDuck.setFlyBehaviour(FlyWithWings())
    modelDuck.performFly()
}