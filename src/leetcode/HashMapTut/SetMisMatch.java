package leetcode.HashMapTut;

import java.util.*;

public class SetMisMatch {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
        System.out.println(Arrays.toString(findErrorNumsUsingHashMap(nums)));
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
    public static int[] findErrorNumsUsingHashMap(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int duplicate = 0;
        int missing = 0;

        // Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Check from 1 to n
        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                missing = i;
            } else if (map.get(i) == 2) {
                duplicate = i;
            }
        }

        return new int[]{duplicate, missing};
    }

}
