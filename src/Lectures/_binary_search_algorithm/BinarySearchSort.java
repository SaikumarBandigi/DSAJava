package Lectures._binary_search_algorithm;

public class BinarySearchSort {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int target = 50;

        System.out.println(find(a, target));
    }

    static int find(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
