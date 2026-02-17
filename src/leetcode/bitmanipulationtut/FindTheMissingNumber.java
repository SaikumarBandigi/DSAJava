package leetcode.bitmanipulationtut;

import java.util.HashSet;
import java.util.Set;

public class FindTheMissingNumber {
    public static void main(String[] args) {

        System.out.println(findDuplicateUsingHashSet(new int[]{1, 2, 3, 4, 2}));
        System.out.println(findDuplicateUsingBitManipulation(new int[]{3, 3, 3, 3, 3}));

    }

    public static int findDuplicateUsingHashSet(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

    public static int findDuplicateUsingBitManipulation(int[] nums) {
        int bitMask = 0;

        for (int num : nums) {

            // Create mask for current number
            int mask = 1 << num;

            // Check if bit already set
            if ((bitMask & mask) != 0) {
                return num; // duplicate found
            }

            // Set the bit
            bitMask |= mask;
        }
        return -1;
    }

}

