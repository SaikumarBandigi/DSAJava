package spoj;

import java.io.*;
import java.util.*;

public class PrimeGenerator {

    static List<Integer> basePrimes = new ArrayList<>();

    public static void main(String[] args) throws java.lang.Exception {

        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();

        int t = fs.nextInt();

        // Precompute primes up to sqrt(10^9)
        sieve(31622);

        while (t-- > 0) {

            int m = fs.nextInt();
            int n = fs.nextInt();

            boolean[] isPrime = new boolean[n - m + 1];
            Arrays.fill(isPrime, true);

            for (int p : basePrimes) {
                long p2 = (long) p * p;
                if (p2 > n) break;

                int start = (int) Math.max(p2, ((m + p - 1) / p) * (long) p);
                for (int j = start; j <= n; j += p) {
                    isPrime[j - m] = false;
                }
            }

            if (m == 1) isPrime[0] = false;

            for (int i = 0; i < isPrime.length; i++) {
                if (isPrime[i]) {
                    out.append(m + i).append('\n');
                }
            }

            if (t > 0) out.append('\n'); // blank line between test cases
        }

        System.out.print(out.toString());
    }

    static void sieve(int limit) {

        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) basePrimes.add(i);
        }
    }

    // 🚀 FAST INPUT
    static class FastScanner {
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        private int readByte() throws IOException {
            if (ptr >= len) {
                len = System.in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c, sign = 1, val = 0;
            do {
                c = readByte();
            } while (c <= ' ');

            if (c == '-') {
                sign = -1;
                c = readByte();
            }

            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = readByte();
            }
            return val * sign;
        }
    }
}
