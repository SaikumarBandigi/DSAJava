package leetcodecontest.weekly.five03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LimitOccurrencesinSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(new LimitOccurrencesinSortedArray().limitOccurrences(nums, k)));
    }

    public int[] limitOccurrences(int[] nums, int k) {

        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }


        // calculate final size
        int size = 0;

        for (int value : map.values()) {
            size += Math.min(value, k);
        }

        int[] ans = new int[size];

        int index = 0;

        // build answer array
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();

            int limit = Math.min(value, k);

            for (int i = 0; i < limit; i++) {
                ans[index++] = key;
            }
        }

        return ans;
    }

}
