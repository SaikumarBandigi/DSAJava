package interviewTut.array_hashmap;

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  // complement=target-current
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }

    public static boolean hasPair(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(hasPair(nums, 9));
    }


}
/*

Whenever you hear:

pair sum
target sum
two sum
complement
difference equals k

Immediately think:
HashMap / HashSet

and:
complement = target - current

 */