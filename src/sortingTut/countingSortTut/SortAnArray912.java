package sortingTut.countingSortTut;

import java.util.Arrays;

public class SortAnArray912 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        System.out.println(Arrays.toString(new SortAnArray912().sortArray(nums)));

    }

    public int[] sortArray(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Frequency array
        int[] count = new int[max - min + 1];

        // Count occurrences
        for (int num : nums) {
            count[num - min]++;
        }

        // Put elements back into nums
        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                nums[index++] = i + min;
                count[i]--;
            }
        }
        return nums;
    }
    
}
