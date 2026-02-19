package leetcode.MathTut;

public class FibonacciNumber {
    public static void main(String[] args) {

        int num = 2;
        System.out.println(fib(num));
    }

    public static int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        int first = 0;
        int second = 1;
        int third = 0;

        for (int i = 2; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }


}

// 0 1 1 2 3 5

// 1 1
// 1 2