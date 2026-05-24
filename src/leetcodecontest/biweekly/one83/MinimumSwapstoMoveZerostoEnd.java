package leetcodecontest.biweekly.one83;

import java.util.Arrays;

public class MinimumSwapstoMoveZerostoEnd {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(new MinimumSwapstoMoveZerostoEnd().minimumSwaps(nums));

    }

    public int minimumSwaps(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int swaps = 0;

        while (left < right) {

            // find zero from left
            while (left < nums.length && nums[left] != 0) {
                left++;
            }

            // find non-zero from right
            while (right >= 0 && nums[right] == 0) {
                right--;
            }

            if (left < right) {

                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                swaps++;

                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(nums));

        return swaps;
    }

}
