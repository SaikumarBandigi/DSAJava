package Lectures.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int target = 50;

        int res = findBinarySearch(a, target);
        System.out.println(res);
    }

    private static int findBinarySearch(int[] a, int target) {

        int s = 0;
        int e = a.length - 1;

        while (s <= e) {

            int m = s + (e - s) / 2;
            if (a[m] == target) {
                return m;
            } else if (target < m) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }
}
