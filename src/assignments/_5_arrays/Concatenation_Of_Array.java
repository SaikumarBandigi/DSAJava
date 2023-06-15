package assignments._5_arrays;

import java.util.Arrays;

public class Concatenation_Of_Array {
    public static void main(String[] args) {

        int[] num = {1, 2, 1};

        int[] res = getConcatenation(num);
        System.out.println(Arrays.toString(res));

    }

    public static int[] getConcatenation(int[] nums) {

        int[] naya = new int[nums.length * 2];

        for (int i = 0; i < naya.length; i++) {

            if (i < nums.length) {
                naya[i] = nums[i];
            } else {
                naya[i] = nums[i - nums.length];
            }
        }

        return naya;
    }
}
