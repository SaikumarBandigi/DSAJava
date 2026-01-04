package leetcode.MathTut;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        System.out.println(new DivideTwoIntegers().divide(100, 3));
    }

    public int divide(int dividend, int divisor) {
        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine sign of result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Convert to long & take absolute values
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        // Main division logic
        while (a >= b) {
            long temp = b;
            int multiple = 1;

            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            a -= temp;
            result += multiple;
        }
        return negative ? -result : result;
    }

}
