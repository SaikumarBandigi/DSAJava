package leetcode.arrayconcept;

import java.util.Arrays;

public class TwoPointerExample {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7, 10};
        int target = 13;

        int[] res = findPairWithSum(arr, target);
        System.out.println(Arrays.toString(res));
    }

    // Method to find a pair with the given sum using two pointers
    public static int[] findPairWithSum(int[] arr, int target) {
        // Sort the array first
        Arrays.sort(arr);

        int left = 0;               // Start pointer
        int right = arr.length - 1; // End pointer

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;  // Increase sum by moving left pointer
            } else {
                right--; // Decrease sum by moving right pointer
            }
        }
        return new int[]{-1, -1};
    }

}