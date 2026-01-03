package arrays.twopointertechnique;

import java.util.Arrays;

public class TwoPointersExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 17;

        System.out.println(Arrays.toString(arr));
        System.out.println(target);

        findPairsWithSum(arr, target);
    }

    private static void findPairsWithSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                left++;
                right--;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

    }


}
