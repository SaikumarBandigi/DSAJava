package patternMust.slidingwindow;

public class MaxSubarraySumFixedWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(maxSum(arr, k));
        System.out.println(maxSumOptimal(arr, k));
    }
    public static int maxSum(int[] arr, int k) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int currentSum = 0;
            for (int j = i; j < i + k; j++) {
                currentSum += arr[j];
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
    public static int maxSumOptimal(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }
}