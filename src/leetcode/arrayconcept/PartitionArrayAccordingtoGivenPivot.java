package leetcode.arrayconcept;

import java.util.Arrays;

public class PartitionArrayAccordingtoGivenPivot {

    public static void main(String[] args) {

        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;


        System.out.println(Arrays.toString(new PartitionArrayAccordingtoGivenPivot().pivotArray(nums, pivot)));

    }


    public int[] pivotArray(int[] nums, int pivot) {

        int n = nums.length;
        int[] result = new int[n];

        int idx = 0;

        // Elements smaller than pivot
        for (int num : nums) {
            if (num < pivot) {
                result[idx++] = num;
            }
        }

        // Elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                result[idx++] = num;
            }
        }

        // Elements greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                result[idx++] = num;
            }
        }

        return result;
    }

}
