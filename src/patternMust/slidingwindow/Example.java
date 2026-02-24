package patternMust.slidingwindow;

public class Example {
    public static int maxSumSubarray(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            throw new IllegalArgumentException("Array size is smaller than k");
        }

        int maxsum;
        int wSum = 0;

        for (int i = 0; i < k; i++) {
            wSum += arr[i];
        }

        maxsum = wSum;

        for (int i = k; i < arr.length; i++) {
            wSum = wSum + arr[i] - arr[i - k];
            maxsum = Math.max(wSum, maxsum);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = maxSumSubarray(arr, k);
        System.out.println(result);
    }
}
