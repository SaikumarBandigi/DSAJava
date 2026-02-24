package leetcode.HashMapTut;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMisMatch {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }

    public static int[] findErrorNums(int[] nums) {

        Set<Integer> set = new HashSet<>();
        int duplicate = 0;
        int actualSum = 0;

        for (int num : nums) {
            if (!set.add(num)) {
                duplicate = num;
            }
            actualSum += num;
        }

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int missing = expectedSum - (actualSum - duplicate);

        return new int[]{duplicate, missing};
    }

}
