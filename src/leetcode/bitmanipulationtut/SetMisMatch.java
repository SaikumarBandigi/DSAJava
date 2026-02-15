package leetcode.bitmanipulationtut;

import java.util.Arrays;

public class SetMisMatch {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }

    public static int[] findErrorNums(int[] nums) {

        int n = nums.length;

        int xor = 0;

        // Step 1: XOR all array elements
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: XOR numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor ^= i;
        }

        // Now xor = missing ^ duplicate

        // Step 3: Get rightmost set bit
        int rightmostSetBit = xor & -xor;

        int num1 = 0;
        int num2 = 0;

        // Step 4: Divide numbers into two groups
        for (int num : nums) {
            if ((num & rightmostSetBit) != 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        for (int i = 1; i <= n; i++) {
            if ((i & rightmostSetBit) != 0) {
                num1 ^= i;
            } else {
                num2 ^= i;
            }
        }

        // Now num1 and num2 are missing and duplicate
        // We need to check which is duplicate

        for (int num : nums) {
            if (num == num1) {
                return new int[]{num1, num2};
            }
        }

        return new int[]{num2, num1};

    }

}
