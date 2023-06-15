package Lectures._binary_search_algorithm;

public class Practise {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80};
        int target = 20;
        int res = find(a, target);
        System.out.println(res);
    }
    static int find(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        boolean isAsc;
        isAsc = a[start] < a[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == a[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < a[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > a[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}