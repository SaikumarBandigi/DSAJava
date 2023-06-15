package assignments._5_arrays;

// https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;

public class Build_Array_from_Permutation {
    public static void main(String[] args) {
        int[] num = {0,2,1,5,3,4}; // Example permutation
        int[] array = buildArray(num);

        System.out.println("Array: " + Arrays.toString(array));
    }

    public static int[] buildArray(int[] num) {
        int n = num.length;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = num[num[i]];
        }
        return array;
    }
}
