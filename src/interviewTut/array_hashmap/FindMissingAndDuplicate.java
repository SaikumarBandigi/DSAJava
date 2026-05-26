package interviewTut.array_hashmap;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindMissingAndDuplicate {

    //    public static void main(String[] args) {
//
//        int[] arr = {1, 2, 2, 4};
//
//        boolean[] seen = new boolean[arr.length + 1];
//
//        int duplicate = -1;
//
//        for (int num : arr) {
//            if (seen[num]) {
//                duplicate = num;
//            }
//            seen[num] = true;
//        }
//
//        int missing = -1;
//
//        for (int i = 1; i <= arr.length; i++) {
//            if (!seen[i]) {
//                missing = i;
//            }
//        }
//
//        System.out.println("Duplicate = " + duplicate);
//        System.out.println("Missing = " + missing);
//    }
    public static void main(String[] args) {


        int[] nums = {1, 2, 2, 4, 5};

        int duplicate = -1;
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                duplicate = num;
            }
        }

        int missing = -1;

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missing = i;
            }
        }

        System.out.println("Duplicate " + duplicate);
        System.out.println("Missing " + missing);

    }

}
