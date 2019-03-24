package main.design_patterns.decorator.validation

/**
 * Created by johannesC on 2019/03/05.
 */
abstract class Validator {

    abstract fun isLoggedIn(validationCriteria: String) : Boolean
}