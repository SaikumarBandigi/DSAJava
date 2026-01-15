package stringTut;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {


        int a = 15, b = 30;
        System.out.println(LCM(a, b));

    }

    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

    private static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
