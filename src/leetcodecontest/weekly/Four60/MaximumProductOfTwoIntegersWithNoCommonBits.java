package leetcodecontest.weekly.Four60;

public class MaximumProductOfTwoIntegersWithNoCommonBits {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(maxProduct(nums));
    }

    public static long maxProduct(int[] nums) {

        long max = 0;

        // Compare each pair using bitwise AND
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] & nums[j]) == 0) { // no common bits
                    long product = (long) nums[i] * (long) nums[j];
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }

        return max;
    }

}
