package leetcode.matrixTut;

public class ReshapeTheMatrix {
    public static void main(String[] args) {

        int[][] mat = {{1, 2}, {3, 4}};
        int r = 4;
        int c = 1;
        int[][] res = matrixReshape(mat, r, c);

        for (int[] eachRow : res) {
            for (int elementInRow : eachRow) {
                System.out.print(elementInRow + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            System.out.println("Reshape not possible. Returning original matrix.");
            return mat;
        }

        int[][] res = new int[r][c];

        for (int i = 0; i < m * n; i++) {

            int oldRow = i / n;
            int oldCol = i % n;

            int newRow = i / c;
            int newCol = i % c;

            System.out.println("Moving mat[" + oldRow + "][" + oldCol + "] = "
                            + mat[oldRow][oldCol]
                            + "  --->  res[" + newRow + "][" + newCol + "]"
            );

            res[newRow][newCol] = mat[oldRow][oldCol];
        }

        return res;
    }

}
