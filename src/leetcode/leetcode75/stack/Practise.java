package leetcode.leetcode75.stack;

public class Practise {
    public static void main(String[] args) {
        int n = 3; // Number to calculate the factorial
        System.out.println("Factorial of " + n + " is " + factorialIterative(n));
    }

    // Iterative function to calculate factorial
    public static int factorialIterative(int num) {
        if (num <= 1) {
            return 1;
        }
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res *= i;
        }
        return res;
    }

}
