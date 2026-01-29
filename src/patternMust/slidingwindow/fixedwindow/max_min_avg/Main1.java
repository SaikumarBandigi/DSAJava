package patternMust.slidingwindow.fixedwindow.max_min_avg;

public class Main1 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 7;

        System.out.println(minSubArrayLen(k, arr));
        System.out.println(maxSubArrayLen(k, arr));

    }

    public static int minSubArrayLen(int k, int[] arr) {

        int left = 0;
        int wSum = 0;
        int minLen = Integer.MAX_VALUE;

        // expand window

        for (int right = 0; right < arr.length; right++) {
            wSum += arr[right];

            // shrink window while condition is satisfied
            while (wSum >= k) {
                minLen = Math.min(minLen, right - left + 1);
                wSum -= arr[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static int maxSubArrayLen(int k, int[] arr) {

        int left = 0, wSum = 0;
        int maxLen = Integer.MIN_VALUE;

        for (int right = 0; right < arr.length; right++) {
            wSum += arr[right];

            // shrink while INVALID
            while (wSum > k) {
                wSum -= arr[left];
                left++;
            }

            // update AFTER window is valid
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

}


