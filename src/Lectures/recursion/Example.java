package Lectures.recursion;

// 0 1 2 3 4 5 6 7 8
// 0 1 1 2 3 5 8 13 21

public class Example {
    public static void main(String[] args) {

        System.out.println(fact(30));

    }

    private static long fact(long num) {

        if (num == 0 || num == 1) {
            return 1;
        }

        long res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }

        return res;
    }
}
