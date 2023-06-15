package Lectures._linear_search_algorithm;
/*

remember to store first element in new int variable so that you can traverse.

 */
public class TargetElement {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int target = 4;
        int result = linerSearch(a, target);
        System.out.println(result);
    }

    private static int linerSearch(int[] a, int target) {

        if (a.length == 0) {
            return -1;
        }
        for (int index = 0; index < a.length; index++) {
            int element = a[index];
            if (element == target) {
                return index;
            }
        }
        return -1;

    }
}
