package leetcode.bitmanipulationtut;

import java.util.HashSet;
import java.util.Set;

public class FindTheMissingNumber {
    public static void main(String[] args) {

        System.out.println(findDuplicateUsingHashSet(new int[]{1, 2, 3, 4, 2}));

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


}

