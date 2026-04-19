package leetcode.MathTut;

public class PerfectSquares {

    public static void main(String[] args) {
        int n = 12;
        System.out.println(new PerfectSquares().numSquares(n)); // 4+4+4
    }

    public int numSquares(int n) {
        return helper(n);
    }

    private int helper(int n) {
        // base case
        if (n == 0) return 0;

        int min = Integer.MAX_VALUE;

        // try all perfect squares <= n
        for (int i = 1; i * i <= n; i++) {
            int res = helper(n - i * i);
            min = Math.min(min, res + 1);
        }
        return min;
    }

}
