package primepack;

import java.util.*;

public class PrimesSum {
    public static void main(String[] args) {
        System.out.println(isSumOfTwo(6));
    }
    public static String isSumOfTwo(int N) {
        // Generate primes up to N using Sieve of Eratosthenes
        List<Integer> primes = generatePrimes(N);

        // Check if N can be expressed as sum of two primes
        Set<Integer> primeSet = new HashSet<>(primes);
        for (int prime : primes) {
            int complement = N - prime;
            if (primeSet.contains(complement)) {
                return "Yes";
            }
        }
        return "No";
    }

    // Sieve of Eratosthenes to generate primes up to limit
    static List<Integer> generatePrimes(int limit) {
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        List<Integer> primes = new ArrayList<>();

        for (int p = 2; p * p <= limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        for (int p = 2; p <= limit; p++) {
            if (isPrime[p]) {
                primes.add(p);
            }
        }
        return primes;
    }

}
