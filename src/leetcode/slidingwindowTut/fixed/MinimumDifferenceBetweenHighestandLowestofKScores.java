package leetcode.slidingwindowTut.fixed;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores {

    public static void main(String[] args) {
        int[] arr = {9, 4, 1, 7};
        int k = 2;
        System.out.println(new MinimumDifferenceBetweenHighestandLowestofKScores().minimumDifference(arr, k));
    }

    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums); // 1 4 9 7

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int difference = nums[i + k - 1] - nums[i];
            minDifference = Math.min(minDifference, difference);
        }
        return minDifference;
    }

}