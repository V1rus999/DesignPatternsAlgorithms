package main.cracking_coding_iv

import main.algorithms.TitleProblem

/**
 * Created by johannesC on 2019/02/10.
 */
fun main(args: Array<String>) {
    /**
     *  1. Read the problem twice
     *  2. Solve the problem manually with 3 sets of sample data
     *  3. Optimise the manual steps
     *  4. Write the manual steps as psuedo code
     *  5. Replace the pseudo code with real code
     *  6. Optimise the real code
     */
    println(TitleProblem.capitilizeTitle("hello hoe gAan dit"))

    val expectedNum = twoSum(intArrayOf(11, 7, 2, 15), 9)
    println("Twosum ${expectedNum[0]} ${expectedNum[1]}")

    val containsDup = containsDuplicate(intArrayOf(11, 7, 2, 1))
    println("containsDuplicate $containsDup")
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val dictionary = mutableMapOf<Int, Int>()
    for (i in 0..nums.size) {
        val extra = target - nums[i]
        if (dictionary.containsKey(extra)) {
            return intArrayOf(dictionary[extra]!!, i)
        }
        dictionary[nums[i]] = i
    }
    throw IllegalArgumentException()
}

fun containsDuplicate(nums: IntArray): Boolean {
    nums.sort()
    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1]) return true
    }
    return false
}
