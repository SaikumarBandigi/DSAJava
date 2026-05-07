package leetcode.NumberTheoryTut;

import java.util.ArrayList;
import java.util.List;

public class ThekthFactorofn {

    public static void main(String[] args) {

        int n = 12;
        int k = 3;
        System.out.println(new ThekthFactorofn().kthFactor(n, k)); // 1 2 3 4 6 12

    }

    public int kthFactor(int n, int k) {

        List<Integer> factorsList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (isFactor(n, i)) {
                factorsList.add(i);
            }
        }

        if (k <= factorsList.size()) { // 3<=6
            return factorsList.get(k - 1);
        }

        return -1;
    }

    boolean isFactor(int num, int i) {
        return (num % i) == 0;
    }

}
