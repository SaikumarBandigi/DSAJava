package leetcode.HashTableConcept;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 2, 1, 2, 3, 1, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        /*

        1 - 4 times
        2 - 3 times
        3 - 2 times

         */

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Step 2: Convert map to list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Step 3: Sort based on frequency (descending)
        list.sort(new FrequencyComparator());

        // Step 4: Pick top k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }

}

// Custom Comparator Class
class FrequencyComparator implements Comparator<Map.Entry<Integer, Integer>> {
    @Override
    public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
        // Descending order based on frequency
        return e2.getValue() - e1.getValue();
    }
}