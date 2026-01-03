package accenture.dynamicprog;


import java.util.HashMap;
import java.util.Map;

public class FibonacciDynamicProgramming {

    static Map<Integer, Long> memo = new HashMap<>();


    public static void main(String[] args) {

        int num = 5;
        System.out.println(fibMem(num));
    }

    private static long fibMem(int num) {


        if (num <= 1) {
            return num;
        }

        if (memo.containsKey(num)) {
            return memo.get(num);
        }

        long result = fibMem(num - 1) + fibMem(num - 2);
        memo.put(num, result);
        return result;
    }
}
