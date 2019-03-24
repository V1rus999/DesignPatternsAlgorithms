package main.design_patterns.decorator

import main.design_patterns.decorator.beverages.Espresso
import main.design_patterns.decorator.beverages.FlatWhite
import main.design_patterns.decorator.extras.Milk
import main.design_patterns.decorator.extras.Sugar
import main.design_patterns.decorator.validation.*
import main.printDivider

/**
 * Created by johannesC on 2019/02/27.
 */

/**
The decorator pattern allows behavior to be added to an individual object,
dynamically, without affecting the behavior of other objects from the same class.

You have an HTTP client which creates a connection. Now you want to add logging.
Instead of adding logging in your client you create a LoggingHttpClient which delegates work to the http client but logs the response.

 */
fun main(args: Array<String>) {
    val espresso = Espresso()
    println("${espresso.getDescription()} ${espresso.cost()}")

    var flatWhiteWithSugar : Beverage = FlatWhite()
    flatWhiteWithSugar = Sugar(flatWhiteWithSugar)
    println("${flatWhiteWithSugar.getDescription()} ${flatWhiteWithSugar.cost()}")

    var espressoWithMilk : Beverage = Espresso()
    espressoWithMilk = Milk(espressoWithMilk)
    println("${espressoWithMilk.getDescription()} ${espressoWithMilk.cost()}")

    printDivider()
    LoginCookie.password = "123"
    LoginCookie.username = "John D"

    val usernameValidator = UsernameValidator()
    println("Is John D logged in: ${usernameValidator.isLoggedIn("John D")}")

    //Now we want to add logging without breaking Open Closed Principle/ Single Responsibility so we add a logging validator
    val passwordValidator: Validator = PasswordValidator()
    val loggingValidator: Validator = LoggingValidator(passwordValidator)
    loggingValidator.isLoggedIn("124124124")

}