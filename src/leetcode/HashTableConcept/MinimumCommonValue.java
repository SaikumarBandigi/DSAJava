package leetcode.HashTableConcept;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MinimumCommonValue {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4};

        System.out.println(new MinimumCommonValue().getCommon(nums1, nums2));
    }

    public int getCommon(int[] nums1, int[] nums2) {
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

}
