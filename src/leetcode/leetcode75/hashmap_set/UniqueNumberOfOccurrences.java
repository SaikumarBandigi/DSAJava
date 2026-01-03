package leetcode.leetcode75.hashmap_set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        // Use a HashMap to count occurrences of each number
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Use a HashSet to store unique occurrence counts
        Set<Integer> occurrenceSet = new HashSet<>();
        for (int count : countMap.values()) {
            if (!occurrenceSet.add(count)) {
                // If the count is already in the set, return false
                return false;
            }
        }

        // If all occurrence counts are unique, return true
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 2, 1, 1, 3}; //  1 is 3   2 is 2   3 is 1
        System.out.println(uniqueOccurrences(arr1)); // Output: true

        int[] arr2 = {1, 2};
        System.out.println(uniqueOccurrences(arr2)); // Output: false

        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(uniqueOccurrences(arr3)); // Output: true
    }
}
