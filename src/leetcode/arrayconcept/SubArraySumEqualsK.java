package leetcode.arrayconcept;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    public static void main(String[] args) {

        int[] nums = {1, 2};
        int k = 3;
        System.out.println(subarraySum(nums, k));

    }
    /*
    If:
prefixSum(j) - prefixSum(i) = k

Then:
Subarray from (i+1 to j) = k

prefixSum(i) = prefixSum(j) - k
     */

    public static int subarraySum(int[] nums, int k) {

        int prefixSum = 0;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        for (int num : nums) {
            prefixSum += num;

            int prefixSumI = prefixSum - k;

            if (map.containsKey(prefixSumI)) {
                count += map.get(prefixSumI);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }

}
