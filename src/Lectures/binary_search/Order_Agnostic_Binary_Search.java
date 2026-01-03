package Lectures.binary_search;

public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {

        int[] a = {-1, -2, 3, 6, 9, 88};
        int[] b = {90, 80, 70, 2, 0, -1, -5};
        int target = 0;
        System.out.println(orderAgnosticBS(b, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            boolean isAsc = arr[0] < arr[end];

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                //   int[] a = {-1, -2, 3, 6, 9, 88};
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                //  int[] b = {90, 80, 70, 2, 0, -1, -5};
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
