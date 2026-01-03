package Lectures.bubble_sort_algorithms;

// Bubble Sort

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int[] a = {5, 8, 3, 2, 9, 1};
        int res = find(a);
        System.out.println(res);
    }

    private static int find(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }
}
