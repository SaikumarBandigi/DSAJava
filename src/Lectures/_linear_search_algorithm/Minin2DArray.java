package Lectures._linear_search_algorithm;

public class Minin2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, -1, 6},
                {7, -99, 99}
        };

        int answer = min2DArray(arr);

        System.out.println(answer);

    }

    private static int min2DArray(int[][] arr) {

        int element =Integer.MAX_VALUE;

        // int element=a[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < element) {
                    element = arr[i][j];
                }

            }
        }

        return element;
    }
}
