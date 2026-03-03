package leetcode.arrayconcept;

public class MaximumProductSubArray {
    public static void main(String[] args) {

        int[] nums = {-2, 2};
        System.out.println(maxProductOptimized(nums));  // Output: 0
        System.out.println(maxProductBruteForce(nums));
    }

    public static int maxProductOptimized(int[] nums) {

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // If current number is negative, swap max & min
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            result = Math.max(result, maxProduct);
        }
        return result;
    }

    static int maxProductBruteForce(int[] nums) {

        int maxProduct = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return maxProduct;
    }

}
