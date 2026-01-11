package leetcode.arrayconcept;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDupli(arr));
        System.out.println(containsDupliBruteForce(arr));
    }

    static boolean containsDupli(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    static boolean containsDupliBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
