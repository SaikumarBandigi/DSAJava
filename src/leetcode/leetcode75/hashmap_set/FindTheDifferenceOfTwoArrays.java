package leetcode.leetcode75.hashmap_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // Use sets to store unique elements
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Add elements of nums2 to set2
        for (int num : nums2) {
            set2.add(num);
        }

        // Find elements in nums1 not in nums2
        Set<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);

        // Find elements in nums2 not in nums1
        Set<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);

        // Convert the sets to lists and return the result
        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>(diff1));
        result.add(new ArrayList<>(diff2));

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        List<List<Integer>> result = findDifference(nums1, nums2);
        System.out.println(result); // Output: [[1, 3], [4, 6]]
//
//        int[] nums1_2 = {1, 2, 3, 3};
//        int[] nums2_2 = {1, 1, 2, 2};
//
//        result = findDifference(nums1_2, nums2_2);
//        System.out.println(result); // Output: [[3], []]
    }

}
