package patternMust.slidingwindow;

public class MaximumSubarrayVariableWindow {
    public static void main(String[] args) {
        int[] nums = { -5, 2, 3 };

        System.out.println(maxSubArray(nums));
        System.out.println(maxSumArrayTechniqueKadanesAlgorithmTypeDynamicProgrammingGreedy(nums));
        System.out.println(maxSumVariableWindow(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }

    public static int maxSumArrayTechniqueKadanesAlgorithmTypeDynamicProgrammingGreedy(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static int maxSumVariableWindow(int[] nums) {
        int left = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];          // expand window

            max = Math.max(max, sum);    // update answer

            // shrink when window becomes useless
            if (sum < 0) {
                sum = 0;
                left = right + 1;        // start new window
            }
        }

        return max;
    }


}
