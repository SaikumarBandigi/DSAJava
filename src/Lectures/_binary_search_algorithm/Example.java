package Lectures._binary_search_algorithm;

public class Example {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(findBinary(a, target));

    }

    private static int findBinary(int[] a, int target) {

        int start = 0;
        int end = a.length - 1;

        boolean ISASC = isAsc(a, start, end);


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == a[mid]) {
                return mid;
            }

            if (ISASC) {
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

    private static boolean isAsc(int[] a, int start, int end) {
        return a[start] < a[end];
    }


}
