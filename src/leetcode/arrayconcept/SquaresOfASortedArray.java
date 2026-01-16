package leetcode.arrayconcept;

import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {

        int[] nums = {-4, -1, 0}; // [16,1,0,9,100] -> [0,1,9,16,100]
        System.out.println(Arrays.toString(sortedSquaresTwoPointers(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static int[] sortedSquaresTwoPointers(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }

        return result;
    }


}
