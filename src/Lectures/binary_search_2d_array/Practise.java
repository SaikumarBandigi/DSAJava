package Lectures.binary_search_2d_array;


import java.util.*;

public class Practise {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 55, 6},
                {7, 8, 9}
        };

        int res = findMaxElement(a);
        System.out.println(res);
    }

    private static int findMaxElement(int[][] a) {

        int max = a[0][0];

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        return max;
    }
}
