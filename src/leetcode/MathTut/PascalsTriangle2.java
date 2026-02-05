package leetcode.MathTut;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public static void main(String[] args) {
        System.out.println(new PascalsTriangle2().getRow(3));
    }
    public List<Integer> getRow(int rowIndex) {

        List<Integer> row = new ArrayList<>();

        row.add(1);   // first element always 1

        for (int i = 1; i <= rowIndex; i++) {

            // update from right to left
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }

            row.add(1);   // last element always 1
        }

        return row;
    }

}
