package leetcode.arrayconcept;

import java.util.Arrays;

public class LeftandRightSumDifferences {

    public static void main(String[] args) {

        int[] nums = {10, 4, 8, 3};
        System.out.println(Arrays.toString(new LeftandRightSumDifferences().leftRightDifference(nums)));
        System.out.println(Arrays.toString(new LeftandRightSumDifferences().leftRightDifferenceUsingPrefixSuffix(nums)));

    }

    public int[] leftRightDifference(int[] nums) {

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];


        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                leftSum[i] += nums[j];
            }
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            for (int j = i + 1; j < nums.length; j++) {
                rightSum[i] += nums[j];
            }
        }

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return res;
    }

    public int[] leftRightDifferenceUsingPrefixSuffix(int[] nums) { // {10, 4, 8, 3};

        int n = nums.length;
        int[] result = new int[n];

        int totalSum = 0;  // 25
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            totalSum -= nums[i]; // right sum

            result[i] = Math.abs(leftSum - totalSum);

            leftSum += nums[i];
        }

        return result;
    }

}
