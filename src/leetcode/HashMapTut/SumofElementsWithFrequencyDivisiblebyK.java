package leetcode.HashMapTut;

import java.util.HashMap;
import java.util.Map;

public class SumofElementsWithFrequencyDivisiblebyK {

    public static void main(String[] args) {

        int[] nums = {4, 4, 4, 1};
        int k = 3;

        System.out.println(new SumofElementsWithFrequencyDivisiblebyK().sumDivisibleByKOptimal(nums, k));
        System.out.println(new SumofElementsWithFrequencyDivisiblebyK().sumDivisibleByKUsingHashMap(nums, k));

    }

    public int sumDivisibleByKOptimal(int[] nums, int k) {

        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        int sum = 0;

        for (int num : nums) {
            if (freq[num] % k == 0) {
                sum += num;
            }
        }

        return sum;
    }

    private int sumDivisibleByKUsingHashMap(int[] nums, int k) {

        // 4 -> 3
        // 1 -> 1

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for (int num : nums) {
            if (map.get(num) % k == 0) {
                sum += num;
            }
        }
        return sum;
    }

}
