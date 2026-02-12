package leetcode.matrixTut;

public class ReshapeTheMatrix {
    public static void main(String[] args) {

        int[][] mat = {{1, 2}, {3, 4}};
        int r = 2;
        int c = 2;
        int[][] res = matrixReshape(mat, r, c);

        for (int[] re : res) {
            for (int i : re) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        // Check if reshape is possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        for (int i = 0; i < m * n; i++) {
            result[i / c][i % c] = mat[i / n][i % n];
        }

        return result;
    }

}
