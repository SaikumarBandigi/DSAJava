package assignments._5_arrays;

public class MaxSubArray {
    public static void main(String[] args) {

        int[] nums = {5,4,-1,7,8};
        int res = maxSubArray(nums);
        System.out.println(res);
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            max = Math.max(sum, max);

            if (sum < 0) sum = 0;
        }
        return max;
    }
}

