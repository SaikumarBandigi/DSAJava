package Lectures.binary_search;

public class BSRecursion {
    public static void main(String[] args) {

        //int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 2;
        int res = findBSRecursion(arr, target, 0, arr.length - 1);
        System.out.println(res);

    }

    private static int findBSRecursion(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];


        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (isAsc) {
            if (target < arr[mid]) {
                return findBSRecursion(arr, target, start, mid - 1);
            } else {
                return findBSRecursion(arr, target, mid + 1, end);
            }
        } else {
            if (target > arr[mid]) {
                return findBSRecursion(arr, target, start, mid - 1);
            } else {
                return findBSRecursion(arr, target, mid + 1, end);
            }
        }
    }
}
