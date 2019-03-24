package main

/**
 * Created by johannesC on 2019/02/27.
 */
fun main(args: Array<String>) {
    printDivider()
    main.design_patterns.strategy.main(args)
    printDivider()
    main.design_patterns.observer.main(args)
    printDivider()
    main.design_patterns.decorator.main(args)
}

fun printDivider() {
    println("===============")
}
