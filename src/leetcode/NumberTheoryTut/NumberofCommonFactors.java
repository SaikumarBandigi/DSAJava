package leetcode.NumberTheoryTut;

import java.util.ArrayList;
import java.util.List;

public class NumberofCommonFactors {
    public static void main(String[] args) {

        int a = 12;
        int b = 6;
        System.out.println(new NumberofCommonFactors().commonFactors(a, b));

    }

    public int commonFactors(int a, int b) {
        List<Integer> list = new ArrayList<>();
        int max = Math.max(a, b);

        for (int i = 1; i <= max; i++) {
            if (doesItDivides(a, b, i)) {
                list.add(i);
            }
        }

        return list.size();
    }

    boolean doesItDivides(int a, int b, int number) {
        return a % number == 0 && b % number == 0;
    }

}
