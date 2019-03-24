package main.algorithms

/**
 * Created by johannesC on 2019/02/10.
 */
class TitleProblem {
    companion object {
        fun capitilizeTitle(inputTitle: String): String {
            val stringBuilder = StringBuilder()
            inputTitle.split(' ').map {
                stringBuilder.append(it.toLowerCase().capitalize() + " ")

            }
            return stringBuilder.toString()
        }
    }
}