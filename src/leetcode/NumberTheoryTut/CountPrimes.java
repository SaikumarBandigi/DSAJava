package leetcode.NumberTheoryTut;

public class CountPrimes {
    public static void main(String[] args) {
        int tillLessThanHowMuch = 7;
        System.out.println(countPrimes(tillLessThanHowMuch));
    }
    public static int countPrimes(int n) {

        // If n <= 2, there are no prime numbers less than n
        if (n <= 2)
            return 0;

        // isPrime[i] will be true if i is a prime number
        boolean[] isPrime = new boolean[n];

        // Assume all numbers from 2 to n-1 are prime initially
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Loop till sqrt(n), because any non-prime
        // must have a factor <= sqrt(n)
        for (int i = 2; i * i < n; i++) {

            // If i is still marked as prime
            if (isPrime[i]) {

                // Mark all multiples of i starting from i*i as non-prime
                // (numbers below i*i are already handled by smaller primes)
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count all numbers marked as prime
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i])
                count++;
        }

        return count;
    }

//    static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        if (num == 2) {
//            return true;
//        }
//        if (num % 2 == 0) {
//            return false;
//        }
//        for (int i = 3; i * i <= num; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

}
