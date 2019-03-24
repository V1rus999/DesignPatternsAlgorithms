package main.design_patterns.decorator.validation

/**
 * Created by johannesC on 2019/03/05.
 */
class LoggingValidator constructor(private val validator: Validator) : Validator() {


    override fun isLoggedIn(validationCriteria: String): Boolean {
        val isLoggedIn = validator.isLoggedIn(validationCriteria)
        //Print the value to our logging framework
        println("$validationCriteria has ${if (isLoggedIn) "an" else "no"} active session")
        return isLoggedIn
    }
}