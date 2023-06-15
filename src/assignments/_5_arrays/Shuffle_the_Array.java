package assignments._5_arrays;

import java.util.Arrays;
/*

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Note:
means even numbers of elements.....
 */
public class Shuffle_the_Array {
    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] res = shuffle(nums, n);
        System.out.println(Arrays.toString(res));

    }

    public static int[] shuffle(int[] nums, int n) {

        int[] arr = new int[nums.length];
        int j = 0;
        int k = n;

        for (int i = 0; i < n * 2; i += 2) {
            arr[i] = nums[j++];
        }

        for (int i = 1; i < n * 2; i += 2) {
            arr[i] = nums[k++];
        }

        return arr;

    }
}
