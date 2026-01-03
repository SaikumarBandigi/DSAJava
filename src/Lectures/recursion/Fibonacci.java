package Lectures.recursion;

import java.util.HashMap;
import java.util.Map;

// 0 1 1 2 3 5 8 13 21
public class Fibonacci {
    static Map<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 50;
        long result = fibonacci(n);
        System.out.println(result);
    }

    public static long fibonacci(int n) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        if (n <= 1) {
            return n;
        }

        long fibValue = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, fibValue);
        return fibValue;
    }
}
