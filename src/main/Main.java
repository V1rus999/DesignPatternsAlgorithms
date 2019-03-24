package main;

import main.design_patterns.DuckMainKt;

/**
 * Created by johannesC on 2019/02/18.
 */
public class Main {

    public static void main(String[] args) {
        String fizz = "Fizz";
        String buzz = "Buzz";

        for (int i = 1; i <= 100; i++) {
            StringBuilder sb = new StringBuilder();

            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0) {
                    sb.append(fizz);
                }
                if (i % 5 == 0) {
                    sb.append(buzz);
                }
            } else {
                sb.append(i);
            }

            System.out.println(sb.toString());
        }
    }

}
