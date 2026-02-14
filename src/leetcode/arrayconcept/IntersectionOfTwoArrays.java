package leetcode.arrayconcept;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {10, 20, 30, 40};
        int[] nums2 = {10, 30};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Add nums1 elements to set1
        for (int n : nums1) {
            set1.add(n);
        }

        // Check common elements
        for (int n : nums2) {
            if (set1.contains(n)) {
                result.add(n);
            }
        }

        // Convert set → array
        int[] ans = new int[result.size()];
        int i = 0;

        for (int n : result) {
            ans[i++] = n;
        }

        return ans;
    }

}
