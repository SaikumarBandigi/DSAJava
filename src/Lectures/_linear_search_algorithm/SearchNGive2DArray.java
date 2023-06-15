package Lectures._linear_search_algorithm;

import java.util.Arrays;

public class SearchNGive2DArray {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        int target = 2;

        int[] res = search2DArray(arr, target);

        System.out.println(Arrays.toString(res));
    }

    private static int[] search2DArray(int[][] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    return new int[]{
                            i, j
                    };
                }
            }
        }

        return new int[]{-1, -1};
    }
}
