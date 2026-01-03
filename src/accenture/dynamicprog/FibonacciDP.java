package accenture.dynamicprog;

public class FibonacciDP {
    public static void main(String[] args) {
        int n = 5; // You can change the value of n to generate Fibonacci series up to the desired number.
        int[] memo = new int[n + 1]; // Memoization array to store computed values

        System.out.println("Fibonacci Series up to " + n + ":");
        System.out.println(fibonacci(n,memo));
    }

    // Recursive function with memoization
    private static int fibonacci(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }

        // Check if the value is already computed
        if (memo[n] != 0) {
            return memo[n];
        }

        // Compute the Fibonacci value and store it in the memoization array
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);

        return memo[n];
    }
}
