package practisetut;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        rotate(nums, 2);

        System.out.println(Arrays.toString(nums));
    }

    private static void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        rev(nums, 0, n - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, n - 1);
    }

    static void rev(int[] nums, int start, int end) {

        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

}
