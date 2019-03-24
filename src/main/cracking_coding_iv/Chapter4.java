package main.cracking_coding_iv;

/**
 * Created by johannesC on 2019/02/21.
 */
public class Chapter4 {

    public static void main(String[] args) {
        System.out.println(~(-5) + 1);

        System.out.println(fibo(6));
    }


    private static int fibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibo(n-1 ) + fibo(n-2);
    }

}
