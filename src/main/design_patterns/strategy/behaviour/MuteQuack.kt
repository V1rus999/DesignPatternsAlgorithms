package main.design_patterns.strategy.behaviour

/**
 * Created by johannesC on 2019/02/27.
 */
class MuteQuack : QuackBehaviour {

    override fun quack() {
        println("Im mute")
    }
}