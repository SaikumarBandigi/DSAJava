package leetcode.leetcode75.bitmanipulation;

public class CountingBits {
    public int[] countBits(int n) {

        int[] ans = new int[n + 1];  // Array to store the count of 1's for each number

        for (int i = 1; i <= n; i++) {
            System.out.println("i: " + i + ", ans[i >> 1]: " + ans[i >> 1] + ", (i & 1): " + (i & 1));
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;

    }

    public static void main(String[] args) {
        CountingBits cb = new CountingBits();

        // Test with example 1
        int n1 = 2; // 0 1 2 // 0 01 10
        int[] result1 = cb.countBits(n1);
        System.out.print("Result for n = " + n1 + ": ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test with example 2
        int n2 = 5;
        int[] result2 = cb.countBits(n2);
        System.out.print("Result for n = " + n2 + ": ");
        for (int num : result2) {
            System.out.print(num + " ");
        }


    }
}
