package leetcode.arrayconcept;

import java.util.Arrays;

public class CountIndicesWithOppositeParity {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(new CountIndicesWithOppositeParity().countOppositeParity(nums)));

    }

    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int evenCount = 0;
        int oddCount = 0;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (isEven(nums[i])) {
                // even number → count odd numbers to the right
                answer[i] = oddCount;
                evenCount++;
            } else {
                // odd number → count even numbers to the right
                answer[i] = evenCount;
                oddCount++;
            }
        }

        return answer;
    }

    boolean isEven(int num) {
        return (num & 1) == 0;
    }

}
