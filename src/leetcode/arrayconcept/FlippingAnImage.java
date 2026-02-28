package leetcode.arrayconcept;

public class FlippingAnImage {
    public static void main(String[] args) {

        int[][] image = {
                {1, 0, 0,}, {0, 1, 0}, {0, 0, 1}
        };

        int[][] res = flipAndInvertImage(image);

        for (int[] re : res) {
            for (int i : re) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static int[][] flipAndInvertImage(int[][] image) {

        for (int[] ints : image) {
            rev(ints);
            invert(ints);
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

    static void invert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] ^ 1;
        }
    }

}
