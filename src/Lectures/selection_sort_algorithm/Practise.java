package Lectures.selection_sort_algorithm;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxIndex = maxInd(arr, 0, end);
            swap(arr, maxIndex, end);
        }
    }

    private static void swap(int[] arr, int maxIndex, int end) {

        int temp = arr[maxIndex];
        arr[maxIndex] = arr[end];
        arr[end] = temp;
    }

    private static int maxInd(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}
