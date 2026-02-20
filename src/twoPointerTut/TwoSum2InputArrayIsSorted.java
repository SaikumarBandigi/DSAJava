package twoPointerTut;

import java.util.Arrays;

public class TwoSum2InputArrayIsSorted {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Return 1-indexed positions
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // If no solution exists (though problem guarantees one)
        return new int[]{-1, -1};
    }

}
