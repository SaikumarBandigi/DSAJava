package chatgpt.arrayTUT;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15}; // 3 4 7 10 15 20
        int k = 4;
        System.out.println(findKthLargestElement(arr, k));
    }

    private static int findKthLargestElement(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
}
