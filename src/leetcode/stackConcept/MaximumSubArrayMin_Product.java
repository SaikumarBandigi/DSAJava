package leetcode.stackConcept;

import java.util.Stack;

public class MaximumSubArrayMin_Product {
    public static void main(String[] args) {

        System.out.println(maxSumMinProductTLE(new int[]{1, 2, 3, 2}));
        System.out.println(maxSumMinProductUsingPrefixTLE(new int[]{1, 2, 3, 2}));
        System.out.println(maxSumMinProductOptimized(new int[]{1, 2, 3, 2}));
    }

    public static int maxSumMinProductOptimized(int[] nums) {  // 1 2 3 2
        int n = nums.length;
        long mod = 1_000_000_007;

        // Step 1: Prefix sum
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long maxProduct = 0;
        Stack<Integer> stack = new Stack<>();

        // Step 2: Iterate through elements + sentinel
        for (int i = 0; i <= n; i++) {
            long curr = (i == n) ? 0 : nums[i];

            // Pop elements that are greater than current
            while (!stack.isEmpty() && nums[stack.peek()] > curr) {
                int index = stack.pop();
                int left = stack.isEmpty() ? 0 : stack.peek() + 1;
                int right = i - 1;

                // Subarray sum using prefix sum
                long sum = prefix[right + 1] - prefix[left];
                long product = sum * nums[index];

                maxProduct = Math.max(maxProduct, product);
            }

            stack.push(i);
        }
        return (int) (maxProduct % mod);
    }

    static int maxSumMinProductTLE(int[] nums) {
        int n = nums.length;
        long mod = 1_000_000_007;

        long maxProduct = 0;

        for (int i = 0; i < n; i++) {
            int min = nums[i];

            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
                long sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                long product = sum * min;
                maxProduct = Math.max(maxProduct, product);
            }
        }
        return (int) (maxProduct % mod);
    }

    public static int maxSumMinProductUsingPrefixTLE(int[] nums) {
        int n = nums.length;
        long mod = 1_000_000_007;

        // Step 1: Build prefix sum array
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long maxProduct = 0;

        // Step 2: Generate all subarrays
        for (int i = 0; i < n; i++) {
            int min = nums[i];

            for (int j = i; j < n; j++) {
                // Update minimum in the subarray
                min = Math.min(min, nums[j]);

                // Calculate sum in O(1) using prefix sum
                long sum = prefix[j + 1] - prefix[i];

                // Calculate product
                long product = sum * min;

                // Update max product
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return (int) (maxProduct % mod);
    }

//    public static int maxSumMinProduct(int[] nums) {
//        int n = nums.length;
//        long mod = 1_000_000_007;
//
//        long maxProduct = 0;
//
//        // Outer loop for start index
//        for (int i = 0; i < n; i++) {
//            int min = nums[i];
//
//            // Inner loop for end index
//            for (int j = i; j < n; j++) {
//                // Update minimum in the subarray
//                min = Math.min(min, nums[j]);
//
//                // Calculate sum manually
//                long sum = 0;
//                for (int k = i; k <= j; k++) {
//                    sum += nums[k];
//                }
//
//                // Calculate min-product
//                long product = sum * min;
//
//                // Update maxProduct
//                maxProduct = Math.max(maxProduct, product);
//            }
//        }
//        return (int) (maxProduct % mod);
//    }

}
