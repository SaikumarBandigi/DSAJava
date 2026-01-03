package Lectures.binary_search;

public class BS {
    public static void main(String[] args) {

        int[] a = {-1, -2, 3, 6, 9, 88};
        int target = 88;
        System.out.println(findElBS(a, target));

    }

    private static int findElBS(int[] a, int target) {

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
