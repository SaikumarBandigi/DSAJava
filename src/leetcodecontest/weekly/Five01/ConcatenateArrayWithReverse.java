package leetcodecontest.weekly.Five01;

import java.util.Arrays;

public class ConcatenateArrayWithReverse {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(new ConcatenateArrayWithReverse().concatWithReverse(arr)));

    }

    public int[] concatWithReverse(int[] nums) {

        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            ans[i + n] = nums[n - i - 1];
        }

        return ans;
    }

}
