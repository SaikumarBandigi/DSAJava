package leetcode.leetcode75.array_string;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {5, 4, -1, 7, 8};
        MaximumSubarray solution = new MaximumSubarray();
        int result = solution.maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + result);
        System.out.println(solution.maxSubArrayBruteForce(nums));
    }
    public int maxSubArray(int[] nums) {
        int cSum = nums[0];
        int mSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            cSum = Math.max(nums[i], cSum + nums[i]);
            mSum = Math.max(cSum, mSum);
        }
        return mSum;
    }
    public int maxSubArrayBruteForce(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

}
