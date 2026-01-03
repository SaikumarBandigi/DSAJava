package Lectures.binary_search_2d_array;

import java.util.Arrays;

/*
lower bound is 1 & upper bond is 4
 */
public class BinarySearchMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int target = 10;
        int[] res = searchBinary(a, target);
        System.out.println(Arrays.toString(res));
    }

    private static int[] searchBinary(int[][] matrix, int target) {

//        int r = 0;
//        int c = a.length - 1;
//
//        while (r < a.length && c >= 0) {
//            if (a[r][c] == target) {
//                return new int[]{r, c};
//            }
//            if (a[r][c] < target) {
//                r++;
//            } else {
//                c--;
//            }
//        }
//        return new int[]{-1, -1};

        int row = 0;
        int col = matrix.length;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
//    int[][] a = {
//            {1, 2, 3, 4},
//            {5, 6, 7, 8},
//            {9, 10, 11, 12},
//            {13, 14, 15, 16}
//    };