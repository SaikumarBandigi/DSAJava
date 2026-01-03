package stringTut;

import java.util.HashMap;
// 0 1 1 2 3 5 8 13 21 34 55
public class FibonacciMemoization {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
    public static int fibonacci(int key) {
        if (key <= 1) {
            return key;
        }
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int res = fibonacci(key - 1) + fibonacci(key - 2);
        memo.put(key, res);
        return res;
    }
}

