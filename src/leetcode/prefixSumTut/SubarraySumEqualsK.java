package leetcode.prefixSumTut;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public static void main(String[] args) {

        int[] arr = {1, -1, 1};  // 0  1 0 1
        int k = 1;
        System.out.println(new SubarraySumEqualsK().subarraySum(arr, k));

    }

    public int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 has occurred once
        map.put(0, 1);
        int prefixSum = 0; //
        int count = 0; //

        for (int num : arr) {
            prefixSum += num;
            // currentPrefixSum - previousPrefixSum = k
            // Check if previous prefix sum = currentPrefixSum - k
            int previousPrefixSum = prefixSum - k;

            if (map.containsKey(previousPrefixSum)) {
                count += map.get(previousPrefixSum);
            }

            // Store current prefix sum frequency
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
