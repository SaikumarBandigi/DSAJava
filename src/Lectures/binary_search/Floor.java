package Lectures.binary_search;

/*
{2, 3, 5, 9, 14, 16, 18};

biggest number which is <= target

 */

public class Floor {

    public static void main(String[] args) {

        int[] a = {2, 3, 5, 9, 14, 16, 18};
        int target = 8;

        System.out.println(floorNo(a, target));

    }

    private static int floorNo(int[] a, int target) {

        int start = 0;
        int end = a.length - 1;

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
        return end;
    }
}
