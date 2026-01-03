package leetcode.arrayconcept;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {

        int[] a = {2, 7, 11, 15};
        int target = 18;

        int[] res = twoSum(a, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
