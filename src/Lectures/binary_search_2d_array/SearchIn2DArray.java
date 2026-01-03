package Lectures.binary_search_2d_array;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 8;
//        int[] position = findElementPosition(array, target);
//        System.out.println(Arrays.toString(position));


//        boolean res = findElementPositionb(array, target);
//        System.out.println(res);

    }

//    private static boolean findElementPositionb(int[][] array, int target) {
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                if (array[i][j] == target) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
    //////////////////////

    public static int[] findElementPosition(int[][] array, int target) {
        int[] op = {-1, -1};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    op[0] = i;
                    op[j] = j;
                    return op;
                }
            }
        }
        return op;
    }
}
// N*N=N2->O(N2)