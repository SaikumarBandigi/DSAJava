package leetcode.NumberTheoryTut;

import java.util.Arrays;

public class FindGreatestCommonDivisorOfArray {
    public static void main(String[] args) {
        int[] arr = {16, 32, 10};
//        System.out.println(findGCD(arr));
        System.out.println(findGCDOptimized(arr));

        // Stream version
        int gcd = Arrays.stream(arr).reduce(FindGreatestCommonDivisorOfArray::findActualGCD).orElse(0);
        System.out.println("GCD using streams: " + gcd);
    }

//    public static int findGCD(int[] nums) {
//
//        Arrays.sort(nums);
//
//        int smallestNumber = nums[0];
//        int largestNumber = nums[nums.length - 1];
//
//        return findActualGCD(smallestNumber, largestNumber);
//
//    }

    public static int findGCDOptimized(int[] nums) {
        int gcd = nums[0];
        for (int i = 1; i < nums.length; i++) {
            gcd = findActualGCD(gcd, nums[i]);
        }
        return gcd;

    }

    static int findActualGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
