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
        int extraNumber = 0;
        for (int num : nums) {
            if (!set.add(num)) {
                extraNumber = num;
            }
        }

        int n = nums.length;

        int expectSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        int missingNumber = expectSum - actualSum;

        int[] res = new int[2];
        res[0] = missingNumber;
        res[1] = extraNumber;

        return res;
    }

}
