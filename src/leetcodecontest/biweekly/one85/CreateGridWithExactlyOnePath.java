package leetcodecontest.biweekly.one85;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateGridWithExactlyOnePath {

    public static void main(String[] args) {
        int m = 2, n = 3;
        System.out.println(new CreateGridWithExactlyOnePath().createGrid(m, n));
    }

    public String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(grid[i], '#');
        }

        // First row
        for (int j = 0; j < n; j++) {
            grid[0][j] = '.';
        }

        // Last column
        for (int i = 0; i < m; i++) {
            grid[i][n - 1] = '.';
        }

        List<String> ans = new ArrayList<>();



        for (int i = 0; i < m; i++) {
            ans.add(new String(grid[i]));
        }

        String[] result = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }

}
