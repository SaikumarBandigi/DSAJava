package leetcode.HashMapTut;

import java.util.HashMap;

class LongestHarmoniousSubsequence {

    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.containsKey(num + 1)) {
                max = Math.max(max, map.get(num) + map.get(num + 1));
            }

            if (map.containsKey(num - 1)) {
                max = Math.max(max, map.get(num) + map.get(num - 1));
            }
        }

        return max;
    }

    static void main() {

    }

}
