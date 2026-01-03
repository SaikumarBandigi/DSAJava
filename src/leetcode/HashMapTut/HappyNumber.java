package leetcode.HashMapTut;

import java.util.HashMap;
import java.util.HashSet;

public class HappyNumber {

    // Helper method to calculate the sum of squares of digits of a number
    private int sumOfSquaresOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumber solution = new HappyNumber();

        // Test cases
        System.out.println(solution.isHappy(19)); // Output: true
        System.out.println(solution.isHappy(2));  // Output: false
    }

    private boolean isHappy(int num) {
        HashSet<Integer> seen = new HashSet<>();

        while (num != 1) {
            if (seen.contains((num))) {
                return false;
            }
            seen.add(num);
            num = sumOfSquaresOfDigits(num);
        }
        return true;
    }
}
