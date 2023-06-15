package Lectures._binary_search_algorithm;
public class AgnosticOrder {
    public static void main(String[] args) {
        int[] arr = {101, 102, 103, 104, 105, 106};
        int target = 105;
        int result = findBinary(arr, target);
        System.out.println(result);
    }
    static int findBinary(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;
        isAsc = arr[start] < arr[end];
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
