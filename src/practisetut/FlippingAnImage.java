package practisetut;

import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {

        int[][] image = {{1, 1, 1,}, {0, 0, 0,}, {1, 1, 0}};
        int[][] res = flipAndInvertImage(image);

        for (int[] arr : res) {
            System.out.println(Arrays.toString(arr));
        }


    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] eachRow : image) {
            rev(eachRow);
            flip(eachRow);
        }
        return image;
    }

    static void rev(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    static void flip(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] ^ 1;
        }
    }

}
