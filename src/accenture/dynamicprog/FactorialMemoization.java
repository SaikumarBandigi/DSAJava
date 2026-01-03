package accenture.dynamicprog;

import java.util.HashMap;
import java.util.Map;

public class FactorialMemoization {
    public static void main(String[] args) {

        int num = 9;
        System.out.println(findFib(num));

    }

    static Map<Integer, Long> memo = new HashMap<>();

    private static long findFib(int num) {

        if (num < 0) {
            throw new IllegalArgumentException("error");
        }

        if (num == 0 || num == 1) {
            return num;
        }

        if (memo.containsKey(num)) {
            return memo.get(num);
        }

        long result = findFib(num - 1) + findFib(num - 2);
        memo.put(num, result);

        return result;
    }

}
