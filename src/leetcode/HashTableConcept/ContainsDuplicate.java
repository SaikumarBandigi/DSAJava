package leetcode.HashTableConcept;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1};
        int[] arr2 = {10, 20, 30};

        System.out.println(new ContainsDuplicate().containsDuplicate(arr1));
        System.out.println(new ContainsDuplicate().containsDuplicate(arr2));
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

}
