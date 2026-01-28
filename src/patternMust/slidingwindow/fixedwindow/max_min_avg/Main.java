package patternMust.slidingwindow.fixedwindow.max_min_avg;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(MaxSumSubarrayBrute(arr, k));
        System.out.println(MaxSumSubarraySlidingWindow(arr, k));
        System.out.println(MaxSumFirstWindowThenSlide(arr, k));
        System.out.println(MinSumSubarraySlidingWindow(arr, k));
    }

    public static int MaxSumSubarrayBrute(int[] arr, int k) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static int MaxSumSubarraySlidingWindow(int[] arr, int k) {  // {2, 1, 5, 1, 3, 2}
        int left = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // expand window using right pointer
        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];   // add element
            // when window size == k
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[left]; // remove element
                left++;                 // slide window
            }
        }

        return maxSum;
    }

    public static int MaxSumFirstWindowThenSlide(int[] arr, int k) {
        int windowSum = 0;

        // 🔹 1) FIRST WINDOW
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // 🔹 2) SLIDE WINDOW TO THE RIGHT
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static int exampl(int[] arr, int k) { // {2, 1, 5, 1, 3, 2}
        int left = 0;
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;

        for (int right = 0; right < arr.length; right++) {
            wSum += arr[right];

            if (right - left + 1 == k) {
                mSum = Math.max(wSum, mSum);
                wSum -= arr[left];
                left++;
            }
        }
        return mSum;
    }

    public static int MinSumSubarraySlidingWindow(int[] arr, int k) {  // {2, 1, 5, 1, 3, 2}
        int left = 0;
        int windowSum = 0;
        int minSum = Integer.MAX_VALUE;

        // expand window using right pointer
        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];   // add element
            // when window size == k
            if (right - left + 1 == k) {
                minSum = Math.min(minSum, windowSum);
                windowSum -= arr[left]; // remove element
                left++;                 // slide window
            }
        }

        return minSum;
    }


}

