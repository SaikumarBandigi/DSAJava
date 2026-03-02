package leetcode.arrayconcept;

import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1,};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {

        Set<Integer> set = new TreeSet<>(); // 2 3 1

        for (int num : nums) {
            set.add(num);
        }
        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();


        return getTheThirdHighest(arr);
    }

    static int getTheThirdHighest(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return nums[1];

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;


        for (int num : nums) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != first && num != second) {
                third = num;
            }
        }
        return third;
    }

}
