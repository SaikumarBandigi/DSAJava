package assignments._5_arrays;

import java.util.Arrays;

public class Smaller_Than_the_Current_Number {
    public static void main(String[] args) {

        int[] a = {8, 1, 2, 2, 3};

        int[] res = smallerNumbersThanCurrent(a);
        System.out.println(Arrays.toString(res));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] naya = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count += 1;
                }
            }
            naya[i]=count;
            count=0;
        }
        return naya;
    }
}
