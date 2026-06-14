package leetcode.dynamicprogrammingTut;

public class NthTribonacciNumber {

    public static void main(String[] args) {

        int n = 3;
        System.out.println(new NthTribonacciNumber().tribonacci(n));
        System.out.println(new NthTribonacciNumber().tribonacciBottomUpTabulation(n));

    }

    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int a = 0, b = 1, c = 1;
// for n=3 tn becomes t2+t1+t0
        for (int i = 3; i <= n; i++) {
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }

        return c;
    }

    public int tribonacciBottomUpTabulation(int n) {
        int[] dp = new int[n + 1];

        dp[0] = 0;
        if (n >= 1) dp[1] = 1;
        if (n >= 2) dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }

}
/*

The Tribonacci sequence is defined as:

T0 = 0
T1 = 1
T2 = 1

For n >= 3:
Tn = T(n-1) + T(n-2) + T(n-3)

 */