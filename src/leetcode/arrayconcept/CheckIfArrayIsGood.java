package leetcode.arrayconcept;

import java.util.Arrays;

public class CheckIfArrayIsGood {
    public static void main(String[] args) {

        int[] nums = {1, 3, 3, 2};
        System.out.println(new CheckIfArrayIsGood().isGood(nums));

    }

    public boolean isGood(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        // Check 1 to n-1
        for (int i = 0; i < n - 1; i++) {

            if (nums[i] != i + 1) {
                return false;
            }
        }

        // Last element should also be n-1
        return nums[n - 1] == n - 1;
    }
}
