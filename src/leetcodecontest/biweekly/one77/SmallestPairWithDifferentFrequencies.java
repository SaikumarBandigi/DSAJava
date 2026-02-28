package leetcodecontest.biweekly.one77;

import java.util.*;

public class SmallestPairWithDifferentFrequencies {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4};
        System.out.println(Arrays.toString(minDistinctFreqPair(nums)));
    }

    public static int[] minDistinctFreqPair(int[] nums) {

        // Step 1: Count frequency
        Map<Integer, Integer> freqMap = new TreeMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Convert keys to list (sorted because TreeMap)
        List<Integer> keys = new ArrayList<>(freqMap.keySet());

        int[] result = new int[2];
        boolean found = false;

        // Step 2: Try all pairs in sorted order
        for (int i = 0; i < keys.size(); i++) {

            for (int j = i + 1; j < keys.size(); j++) {
                int num1 = keys.get(i);
                int num2 = keys.get(j);

                int freq1 = freqMap.get(num1);
                int freq2 = freqMap.get(num2);

                if (num2 > num1 && freq1 != freq2) {
                    result[0] = num1;
                    result[1] = num2;
                    found = true;
                    break;
                }
            }

            if (found) break;
        }

        return found ? result : new int[]{-1, -1};
    }

}
