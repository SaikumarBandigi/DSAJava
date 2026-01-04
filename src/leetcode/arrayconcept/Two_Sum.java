package leetcode.arrayconcept;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {

        int[] a = {2, 7, 11, 15};
        int target = 9;

        int[] res = twoSum(a, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }
    public int[] twoSumUsingMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}
