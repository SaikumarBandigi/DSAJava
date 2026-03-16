package leetcode.MathTut;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {

    public static void main(String[] args) {

        int[] arr = {3, 5, 1};
        System.out.println(new CanMakeArithmeticProgressionFromSequence().canMakeArithmeticProgression(arr));
    }

    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);

        int d = arr[0] - arr[1];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != d) {
                return false;
            }
        }
        return true;
    }

}
