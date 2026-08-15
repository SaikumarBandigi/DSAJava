package leetcode.bitmanipulationtut;

public class LongestSubsequenceWithNonZeroBitwiseXOR {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println(new LongestSubsequenceWithNonZeroBitwiseXOR().longestSubsequenceBruteForce(nums));
        System.out.println(new LongestSubsequenceWithNonZeroBitwiseXOR().longestSubsequenceOptimal(nums));

    }

    public int longestSubsequenceBruteForce(int[] nums) {

        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int xor = 0;
            for (int j = i; j < nums.length; j++) {
                xor ^= nums[j];
                if (xor != 0) {
                    res = Math.max(res, j - i + 1);
                }
            }
        }
        return res;
    }

    public int longestSubsequenceOptimal(int[] nums) {
        int n = nums.length;
        int totalXor = 0;
        boolean allZero = true;

        for (int x : nums) {
            totalXor ^= x;
            if (x > 0) {
                allZero = false;
            }
        }
        if (totalXor > 0) {
            return n;
        }

        return allZero ? 0 : n - 1;
    }

}
