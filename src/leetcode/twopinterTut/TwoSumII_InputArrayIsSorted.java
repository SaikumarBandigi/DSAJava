package leetcode.twopinterTut;

import java.util.Arrays;

public interface TwoSumII_InputArrayIsSorted {

    static void main() {

        int[] nums = {2, 3, 4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (target == sum) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

}
