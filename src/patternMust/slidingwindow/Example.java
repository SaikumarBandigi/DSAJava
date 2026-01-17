package patternMust.slidingwindow;

public class Example {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println(MaxSumBruteForce(arr, k));
        System.out.println(maxSumOptimal(arr, k));
    }

    static int MaxSumBruteForce(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int currentSum = 0;
            for (int j = i; j < i + k; j++) {
                currentSum += arr[j];
            }
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }

    public static int maxSumOptimal(int[] nums, int k) {
        // Step 1: Calculate first window sum
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Step 2: Slide the window
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }


}
