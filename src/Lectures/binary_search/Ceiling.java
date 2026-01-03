package Lectures.binary_search;

//  {2, 3, 5, 9, 14, 16, 18};

// smallest number which is >= target

public class Ceiling {
    public static void main(String[] args) {

        int[] a = {2, 3, 5, 9, 14, 16, 18};
        int target = 19;

        System.out.println(ceilingNo(a, target));

    }

    private static int ceilingNo(int[] a, int target) {

        int start = 0;
        int end = a.length - 1;

        if (target > a[a.length - 1]) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == a[mid]) {
                return mid;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}