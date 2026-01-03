package Lectures;

public class PeakIndex2 {
    public static void main(String[] args) {

        int[] a = {1, 33, 66, 2, 99, 42, 17};
        System.out.println(findMaxLinerSearch(a));

    }

    private static int findMaxLinerSearch(int[] arr) {


        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
