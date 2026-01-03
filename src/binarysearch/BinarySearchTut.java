package binarysearch;

public class BinarySearchTut {
    public static void main(String[] args) {

        int[] arr = {10, 20, 40, 60, 90};
        int target = 90;
        int result = searchBinaryMethod(arr, target);
        System.out.println(result);

    }

    private static int searchBinaryMethod(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return -1;
    }
}
