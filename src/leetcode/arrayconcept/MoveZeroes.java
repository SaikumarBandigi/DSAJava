
package leetcode.arrayconcept;

import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] arr) {

        int index = 0;

        // Move all non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill remaining positions with zero
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 5, 0, 3, 8, 0, 2};

        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }
}
