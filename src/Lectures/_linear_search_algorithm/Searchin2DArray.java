package Lectures._linear_search_algorithm;

public class Searchin2DArray {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        int target = 5;

        boolean b = search2D(arr, target);
        System.out.println(b);
    }

    private static boolean search2D(int[][] arr, int target) {

        int element = target;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (element == arr[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
