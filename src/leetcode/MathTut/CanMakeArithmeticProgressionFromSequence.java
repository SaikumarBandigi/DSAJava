package leetcode.MathTut;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4};
        System.out.println(new CanMakeArithmeticProgressionFromSequence().canMakeArithmeticProgression(arr));
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);  // 1 3 5

        int d = arr[1] - arr[0];  // 1

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != d) {
                return false;
            }
        }

        return true;
    }

}
