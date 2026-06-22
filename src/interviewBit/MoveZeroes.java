package interviewBit;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3};
        new MoveZeroes().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }

    void moveZeroes(int[] nums) {

        int index = 0; // 3
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

}
