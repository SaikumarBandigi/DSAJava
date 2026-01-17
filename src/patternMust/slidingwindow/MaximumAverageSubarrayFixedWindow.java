package patternMust.slidingwindow;

public class MaximumAverageSubarrayFixedWindow {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int k = 2;
        System.out.println(new MaximumAverageSubarrayFixedWindow().findMaxAverage(arr, k));
    }

    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(windowSum, maxSum);
        }
        return (double) maxSum / k;
    }

}
