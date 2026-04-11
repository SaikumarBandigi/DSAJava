package leetcode.arrayconcept;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0};
        int[] nums2 = {4, 5};

        new MergeSortedArray().merge(nums1, 3, nums2, 2);
        System.out.println(Arrays.toString(nums1));

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;        // last valid in nums1 // 2->
        int j = n - 1;        // last in nums2  // 1->0->-1
        int k = m + n - 1;    // last position in nums1 // 4->3->2

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // copy remaining nums2 elements
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

}
