package binarysearch;

public class RecBinarySearchTut {
    public static void main(String[] args) {

        int[] arr = {10, 20, 40, 60, 90};
        int target = 90;
        int result = searchBinaryMethodRec(arr, target);
        System.out.println(result);

    }

    private static int searchBinaryMethodRec(int[] arr, int target) {
        return searchBinaryMethodRecAnother(arr, target, 0, arr.length - 1);
    }

    private static int searchBinaryMethodRecAnother(int[] arr, int target, int start, int end) {

        if (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (target > arr[mid]) {
                return searchBinaryMethodRecAnother(arr, target, mid + 1, end);
            } else {
                return searchBinaryMethodRecAnother(arr, target, start, mid - 1);
            }

        }

        return target;
    }


}
