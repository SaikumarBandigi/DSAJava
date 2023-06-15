package Lectures.methods;

import java.util.Arrays;


public class prime {
    public static void main(String[] args) {

        int number = 1009;

        boolean b = isPrime(number);

        System.out.println(b);

    }

    private static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        int c = 2;

        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
