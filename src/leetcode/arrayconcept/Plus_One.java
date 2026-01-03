package leetcode.arrayconcept;

import java.util.Arrays;

public class Plus_One {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9};
        System.out.println(Arrays.toString((plusOne(arr))));
    }

    public static int[] plusOne(int[] digits) {
        // Start by traversing the digits array from right to left
        for (int i = digits.length - 1; i >= 0; i--) {
            // If current digit is less than 9, just add 1 and return the result
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If current digit is 9, set it to 0 and continue to the next left digit
            digits[i] = 0;
        }

        // If we've gone through all digits and all are 9 (e.g., 999 + 1 = 1000),
        // we need to create a new array with an extra digit (e.g., [1, 0, 0, 0])
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;

    }
}
