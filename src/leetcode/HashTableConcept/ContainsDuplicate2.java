package leetcode.HashTableConcept;

import java.util.HashMap;

public class ContainsDuplicate2 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)); // Output: true
        System.out.println(containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)); // Output: true
        System.out.println(containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)); // Output: false
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }

}
