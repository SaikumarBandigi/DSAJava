package Lectures._linear_search_algorithm;

public class SearchandGiveTrueorFalse {
    public static void main(String[] args) {

        int arr[] = {1, 77, 33, 56, 2, 4, 5};

        int target = 77;

        boolean b = linSearch(arr, target);

        System.out.println(b);

    }

    private static boolean linSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return false;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (target == element) {
                return true;
            }

        }


        return false;
    }
}
