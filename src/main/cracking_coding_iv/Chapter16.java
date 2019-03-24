package main.cracking_coding_iv;

/**
 * Created by johannesC on 2019/02/21.
 */
public class Chapter16 {

    public static void main(String[] args) {
        swap(10,-3);
    }

    //Function to swap numbers in place
    public static void swap(int x, int y) {
        System.out.println("X = " + x + " Y = " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("X = " + x + " Y = " + y);
    }
}
