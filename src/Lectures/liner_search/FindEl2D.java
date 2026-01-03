package Lectures.liner_search;

public class FindEl2D {
    public static void main(String[] args) {

        int[][] a = {
                {10, 20, 30},
                {40, 50, 60}
        };
        int target = 50;

//        int[] res = findEl2D(a, target);
//
//        for (int e : res) {
//            System.out.print(e + " ");
//        }

        int result = findMaxin2D(a);
        System.out.println(result);

        int minresult = findMinin2D(a);
        System.out.println(minresult);


    }

    private static int findMaxin2D(int[][] a) {

        int min = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > min) {
                    min = a[i][j];
                }
            }
        }

        return min;
    }

    private static int findMinin2D(int[][] a) {

        int max = Integer.MAX_VALUE;

        for (int[] ints : a) {
            for (int anInt : ints) {
                if (anInt < max) {
                    max = anInt;
                }
            }
        }

        return max;
    }

    private static int[] findEl2D(int[][] a, int target) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
