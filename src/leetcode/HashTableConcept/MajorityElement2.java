package leetcode.HashTableConcept;

import java.util.*;

public class MajorityElement2 {

    public static void main(String[] args) {

        int[] arr = {3, 2, 3};
        System.out.println(new MajorityElement2().majorityElement(arr));

    }

    public List<Integer> majorityElement(int[] nums) {

        Set<Integer> set = new HashSet<>();

        int appear = nums.length / 3;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums) {
            if (map.get(num) > appear) {
                set.add(num);
            }
        }

        return set.stream().toList();
    }

}
