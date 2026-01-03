package Lectures.binary_search_2d_array;

public class SearchInArray {
    public static void main(String[] args) {

        int[] a = {10, 8, 1, 4, 7, 3};
        int target = 4;
        int res = s(a, target);
        System.out.println(res);
    }

    public static int s(int[] a, int target) {
        for (int i = 0; i <a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
