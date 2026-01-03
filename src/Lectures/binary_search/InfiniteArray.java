package Lectures.binary_search;

public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = new int[]{3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int ans = findPos(arr, 7);
        System.out.println("Element found at index "
                + ans);

    }

    private static int findPos(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;

        }
        return binSearch(arr, target, start, end);
    }

    static int binSearch(int[] a, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == a[mid]) {
                return mid;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
