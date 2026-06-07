package leetcodecontest.weekly.five05;

import java.util.ArrayList;
import java.util.List;

public class SumofCompatibleNumbersinRange1 {

    public static void main(String[] args) {
        int n = 2, k = 3;
        System.out.println(new SumofCompatibleNumbersinRange1().sumOfGoodIntegers(n, k));
    }

    public int sumOfGoodIntegers(int n, int k) {
        return compatible(n, k);
    }

    int compatible(int n, int k) {


        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n + k; i++) {
            if (Math.abs(n - i) <= k && (n & i) == 0) {
                list.add(i);
            }
        }

        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }

}