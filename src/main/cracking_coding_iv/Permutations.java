package main.cracking_coding_iv;

/**
 * Created by johannesC on 2019/02/19.
 */
public class Permutations {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        Permutations permutation = new Permutations();
        permutation.permute(str, 0, n - 1);
    }

    private void permute(String str, int startingIndex, int endIndex) {
        if (startingIndex == endIndex)
            System.out.println(str);
        else {
            for (int i = startingIndex; i <= endIndex; i++) {
                str = swap(str, startingIndex, i);
                permute(str, startingIndex + 1, endIndex);
            }
        }
    }

    private String swap(String stringToSwapIn, int positionA, int positionB) {
        char[] characters = stringToSwapIn.toCharArray();
        char temp = characters[positionA];
        characters[positionA] = characters[positionB];
        characters[positionB] = temp;
        return String.valueOf(characters);
    }
}
