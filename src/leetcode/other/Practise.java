package leetcode.other;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 4, 5};
        int target = 3;
        int[] res = find(a, target);
        System.out.println(Arrays.toString(res));
    }
    private static int[] find(int[] a, int target) {
        int[] ret = {-1, -1};
        int start = give(a, target, true);
        int end = give(a, target, false);

        ret[0] = start;
        ret[1] = end;

        return ret;
    }
    private static int give(int[] a, int target, boolean b) {
        int user = -1;
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                user = mid;
                if (b) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return user;
    }
}
