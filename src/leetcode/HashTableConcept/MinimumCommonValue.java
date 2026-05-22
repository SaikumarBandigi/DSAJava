package leetcode.HashTableConcept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MinimumCommonValue {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};

        System.out.println(new MinimumCommonValue().getCommonUsingSet(nums1, nums2));
        System.out.println(new MinimumCommonValue().getCommonUsing2Pointers(nums1, nums2));

        System.out.println(new MinimumCommonValue().getCommonUsing2Pointers(new int[]{1, 3}, new int[]{2, 3, 4}));
    }

    public int getCommonUsingSet(int[] nums1, int[] nums2) {
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : nums1) {
            set.add(num);
        }

        for (int num : nums2) {
            if (set.contains(num)) {
                return num;
            }
        }
        return -1;
    }

    public int getCommonUsing2Pointers(int[] nums1, int[] nums2) {// 1 3   // 2 3 4

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                return nums1[i];
            }

            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return -1;
    }

}
