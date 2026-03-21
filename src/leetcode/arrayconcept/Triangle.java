package leetcode.arrayconcept;


import java.util.ArrayList;
import java.util.List;

public class Triangle {

    public static void main(String[] args) {

        List<List<Integer>> lists = List.of(
                List.of(-1), List.of(2, 3), List.of(1, -1, -3)
        );

        System.out.println(new Triangle().minimumTotal(lists));

    }

    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();

        // Start from last row
        List<Integer> dp = new ArrayList<>(triangle.get(n - 1));

        // Bottom-up calculation
        for (int i = n - 2; i >= 0; i--) {
            List<Integer> current = triangle.get(i);
            for (int j = 0; j < current.size(); j++) {
                int val = current.get(j) + Math.min(dp.get(j), dp.get(j + 1));
                dp.set(j, val);
            }
        }

        return dp.get(0);
    }

}
