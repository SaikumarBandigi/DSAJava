package patternMust.slidingwindow;

public class MaxSubarraySumBruteForce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(maxSum(arr, 3));
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

}