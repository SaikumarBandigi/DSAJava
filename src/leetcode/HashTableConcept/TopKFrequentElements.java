package leetcode.HashTableConcept;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {

        int[] nums = {3, 3, 2, 1, 1, 1};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
        System.out.println(Arrays.toString(topKFrequentUsingMinHeap(nums, k)));
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

    public static int[] topKFrequentUsingMinHeap(int[] nums, int k) {
        // Step 1: Count frequency
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create Min Heap based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(new MinHeapComparator());

        // Step 3: Add elements to heap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.offer(entry);

            // Maintain size k
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest frequency
            }
        }

        // Step 4: Extract result
        int[] result = new int[k];
        int i = 0;

        while (!minHeap.isEmpty()) {
            result[i++] = minHeap.poll().getKey();
        }

        return result;
    }

}

// Custom Comparator Class
class FrequencyComparator implements Comparator<Map.Entry<Integer, Integer>> {
    @Override
    public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
        // Descending order based on frequency
        return Integer.compare(e2.getValue(), e1.getValue());
    }
}


// Separate Comparator Class (Min Heap based on frequency)
class MinHeapComparator implements Comparator<Map.Entry<Integer, Integer>> {
    @Override
    public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2) {
        // Ascending order (smallest frequency at top)
        return Integer.compare(e1.getValue(), e2.getValue());
    }
}