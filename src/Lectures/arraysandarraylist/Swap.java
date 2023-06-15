package Lectures.arraysandarraylist;


import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] arr = {1, 34, 3, 42, 7, 8};

        //swap(arr, 1, 3);

        // System.out.println(Arrays.toString(arr));

        System.out.println(max(arr));

        //  reverse(arr);
        //  System.out.println(Arrays.toString(arr));
    }

    static void reverse(int a[]) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            swap(a, start, end);
            start++;
            end--;
        }
    }

    static int max(int[] arr) {
        int maxvalue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxvalue) {
                maxvalue = arr[i];
            }
        }

        return maxvalue;
    }



    static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}
