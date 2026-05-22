package interviewTut;

import java.util.HashMap;

public class FibonacciMemo {

    static HashMap<Integer, Integer> memo = new HashMap<>();

    static int fib(int n) {
        if (n <= 1)
            return n;

        if (memo.containsKey(n))
            return memo.get(n);

        int value = fib(n - 1) + fib(n - 2);
        memo.put(n, value);

        return value;
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }

}
