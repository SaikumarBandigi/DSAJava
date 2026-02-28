package leetcodecontest.biweekly.one77;

public class SumOfKDigitNumbersInRange {
    public static void main(String[] args) {

        long L = 1;
        long R = 2;
        int k = 2;

        System.out.println(sumOfKDigitNumbersInRange(L, R, k));
    }

    public static long sumOfKDigitNumbersInRange(long L, long R, int k) {

        long start = (long) Math.pow(10, k - 1);
        long end = (long) Math.pow(10, k) - 1;

        // Find intersection with [L, R]
        long left = Math.max(L, start);
        long right = Math.min(R, end);

        if (left > right) {
            return 0; // No k-digit numbers in range
        }

        // Arithmetic sum formula
        return (right - left + 1) * (left + right) / 2;
    }
}