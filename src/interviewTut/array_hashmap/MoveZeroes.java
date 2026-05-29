package interviewTut.array_hashmap;

import java.util.Arrays;

public class MoveZeroes {


    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3};  // 1 2 3 0 0
        new MoveZeroes().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    void moveZeroes(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

}
