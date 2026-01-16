package patternMust.slidingwindow;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3};
        int target = 7;

        System.out.println(minSubArrayLenBruteForce(target, arr));
    }

    public static int minSubArrayLenBruteForce(int target, int[] nums) {

        int n = nums.length;
        int minLen = Integer.MAX_VALUE;

        // start index
        for (int i = 0; i < n; i++) {
            int sum = 0;
            // end index
            for (int j = i; j < n; j++) {
                sum += nums[j];

                if (sum >= target) {
                    minLen = Math.min(minLen, j - i + 1);
                    break; // no need to extend further
                }
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;

    }
}
