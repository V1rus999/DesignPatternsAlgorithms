package main.cracking_coding_iv;

import java.util.*;

/**
 * Created by johannesC on 2019/02/19.
 */
public class Chapter1 {


    public static void main(String[] args) {
        System.out.println(Chapter1.checkStringHasAllUnique("hey"));

        System.out.println(Chapter1.checkIsPalindromePermutation("heyehydr"));

        System.out.println(Chapter1.checkIsOneWay("acb", "acc"));
    }

    private static boolean checkStringHasAllUnique(String stringToCheck) {
        char[] charactersInString = stringToCheck.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c : charactersInString) {
            if (!list.contains(c)) {
                list.add(c);
            } else {
                return false;
            }
        }
        return true;
    }

    // Given a string, write a function to check if it is a permutation of a palindrome
    // If a string with an even length is a palindrome, every character in the string must always occur an even
    // number of times. If the string with an odd length is a palindrome, every character except one of the
    // characters must always occur an even number of times
    private static boolean checkIsPalindromePermutation(String word) {
        if (word == null || word.length() <= 2) {
            return false;
        }
        char[] charactersInWord = word.toCharArray();
        Map<Character, Integer> characterCountMap = new HashMap<>();
        for (char c : charactersInWord) {
            characterCountMap.put(c, characterCountMap.getOrDefault(c, 0) + 1);
        }

        int count = 0;
        for (Character character : characterCountMap.keySet()) {
            count += characterCountMap.get(character) % 2;
        }
        return count <= 1;
    }

    //    There are three types of edits that can be performed on strings: insert a character,
    //    remove a character, or replace a character. Given two strings, write a function to check if they are
    //    one edit (or zero edits) away.
    private static boolean checkIsOneWay(String wordOne, String wordTwo) {
        int lengthDifference = wordOne.length() - wordTwo.length();
        if (lengthDifference > 1 || lengthDifference < -1) {
            return false;
        }

        char[] wordOneChar =  wordOne.toCharArray();
        char[] wordTwoChar =  wordTwo.toCharArray();

        Arrays.sort(wordOneChar);
        Arrays.sort(wordTwoChar);

        int minimumLength = wordOneChar.length <= wordTwoChar.length ? wordOneChar.length : wordTwoChar.length;
        int differenceCount = 0;
        for (int i = 0; i < minimumLength; i++) {
            if (wordOneChar[i] != wordTwoChar[i] && ++differenceCount > 1) {
                return false;
            }
        }
        return true;
    }
}
