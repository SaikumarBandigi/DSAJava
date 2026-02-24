package leetcode.stringmatching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 5;
        System.out.println(Arrays.toString(new Example().twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }


}
