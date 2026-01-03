package leetcode.leetcode75.hashmap_set;

import java.util.HashMap;
import java.util.Map;


public class EqualRowAndColumnPairs {

    public static void main(String[] args) {
        EqualRowAndColumnPairs solution = new EqualRowAndColumnPairs();

        int[][] grid1 = {
                {3, 2, 1},
                {1, 7, 6}, {2, 7, 7}
        };
        System.out.println(solution.equalPairs(grid1)); // Output: 1

        int[][] grid2 = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };
        System.out.println(solution.equalPairs(grid2)); // Output: 3
    }

    // Helper method to convert an array to a string
    private String convertArrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(",");
        }
        return sb.toString();
    }

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();
        int count = 0;

        // Convert each row to a string and store in the map with its frequency
        for (int[] row : grid) {
            String rowKey = convertArrayToString(row);
            rowMap.put(rowKey, rowMap.getOrDefault(rowKey, 0) + 1);
        }

        // Check each column against the map
        for (int j = 0; j < n; j++) {
            int[] column = new int[n];
            for (int i = 0; i < n; i++) {
                column[i] = grid[i][j];
            }
            String colKey = convertArrayToString(column);
            count += rowMap.getOrDefault(colKey, 0);
        }

        return count;
    }

}

