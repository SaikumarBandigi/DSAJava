package twoPointerTut;

import java.util.HashSet;

public class TwoPointerUnsortedArray {
    public static boolean hasPairWithSum(int[] arr, int target) {
        HashSet<Integer> seen = new HashSet<>(); // 7 2 5 1 // numbers
                                                  // 1 6 3 7 // complement
        for (int num : arr) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;  // Found a pair
            }
            seen.add(num);
        }
        return false;  // No pair found
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 6};
        int target = 8;
        System.out.println(hasPairWithSum(arr, target));  // Output: true
    }
}
