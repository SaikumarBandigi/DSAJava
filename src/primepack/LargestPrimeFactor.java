package primepack;

public class LargestPrimeFactor {
    public static int largestPrimeFactor(int N) {
        // Step 1: Handle the smallest prime factor, which is 2
        int largestPrime = -1;
        while (N % 2 == 0) {
            largestPrime = 2;
            N /= 2;
        }

        // Step 2: Check for factors starting from 3, incrementing by 2
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            while (N % i == 0) {
                largestPrime = i;
                N /= i;
            }
        }

        // Step 3: If N is still greater than 1, then it is a prime number
        if (N > 1) {
            largestPrime = N;
        }

        return largestPrime;
    }

    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(5));   // Output: 5
        System.out.println(largestPrimeFactor(24));  // Output: 3
    }
}
