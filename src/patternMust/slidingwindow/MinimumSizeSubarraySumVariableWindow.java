package patternMust.slidingwindow;

public class MinimumSizeSubarraySumVariableWindow {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3};
        int target = 7;

        System.out.println(minSubArrayLenBruteForce(target, arr));
        System.out.println(minSubArrayLenOptimized(target, arr));
    }

    public static int minSubArrayLenBruteForce(int target, int[] nums) {

        int n = nums.length;
        int minLen = Integer.MAX_VALUE;

        // start index
        for (int left = 0; left < n; left++) {
            int sum = 0;
            // end index
            for (int right = left; right < n; right++) {
                sum += nums[right];

                if (sum >= target) {
                    minLen = Math.min(minLen, right - left + 1);
                    break; // no need to extend further
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }

    public static int minSubArrayLenOptimized(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // shrink window while condition satisfied
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

}
