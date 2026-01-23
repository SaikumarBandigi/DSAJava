package leetcode.MathTut;

public class ClimbingStairs {
    public static void main(String[] args) {

        int n = 3;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {

        if (n == 1) return 1;
        if (n == 2) return 2;

        int prev1 = 1; // ways to reach step 1
        int prev2 = 2; // ways to reach step 2
        int current = 0;  // current ways to reach step n

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return prev2;

    }

}
