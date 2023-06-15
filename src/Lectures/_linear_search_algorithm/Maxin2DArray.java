package Lectures._linear_search_algorithm;

public class Maxin2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {5, 300},
                {-100}
        };

        int answer = Max2DArray(arr);
        System.out.println(answer);
    }

    private static int Max2DArray(int[][] arr) {
        int element = arr[0][0];
        for (int row = 0; row < arr.length; row += 1) {
            for (int col = 0; col < arr[row].length; col++) {

//                if (arr[row][col] > element) {
//                    element = arr[row][col];
//                }

                // or //
                if (element < arr[row][col]) {
                    element = arr[row][col];
                }
            }
        }
        return element;
    }
}
