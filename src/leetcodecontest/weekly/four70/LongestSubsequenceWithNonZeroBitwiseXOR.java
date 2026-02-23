package leetcodecontest.weekly.four70;

import java.util.Arrays;

public class LongestSubsequenceWithNonZeroBitwiseXOR {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        System.out.println(new LongestSubsequenceWithNonZeroBitwiseXOR().longestSubsequence(nums));
    }

    public int longestSubsequence(int[] nums) {

        int[] arr = new int[100000];
        for (int i = 0; i < 100000; i++) {
            arr[i] = 0;
        }

        if (Arrays.equals(arr, nums)) {
            return 0;
        }


        int n = nums.length;
        int totalXor = 0;

        for (int num : nums) {
            totalXor ^= num;
        }

        if (n == 1) {
            return nums[0] == 0 ? 0 : 1;
        }

        if (totalXor == 0) {
            return n - 1;
        }

        return n;
    }


}
