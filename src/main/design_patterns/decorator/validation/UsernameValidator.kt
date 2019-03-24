package main.design_patterns.decorator.validation

/**
 * Created by johannesC on 2019/03/05.
 */
class UsernameValidator : Validator() {

    override fun isLoggedIn(validationCriteria: String): Boolean = validationCriteria == LoginCookie.username
}