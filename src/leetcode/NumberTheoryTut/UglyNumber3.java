package leetcode.NumberTheoryTut;

import java.util.ArrayList;
import java.util.List;

public class UglyNumber3 {

    public static void main(String[] args) {

        int n = 3;

        int a = 2;
        int b = 3;
        int c = 5;

        System.out.println(new UglyNumber3().nthUglyNumber(n, a, b, c));

    }

    public int nthUglyNumber(int n, int a, int b, int c) {

        long low = 1;
        long high = 2_000_000_000L; // safe upper bound

        while (low < high) {

            long mid = low + (high - low) / 2;

            if (count(mid, a, b, c) < n) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return (int) low;
    }

    private long count(long x, int a, int b, int c) {

        long ab = lcm(a, b);
        long bc = lcm(b, c);
        long ac = lcm(a, c);
        long abc = lcm(a, bc);

        return (x / a) + (x / b) + (x / c) - (x / ab) - (x / bc) - (x / ac) + (x / abc);
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

}
