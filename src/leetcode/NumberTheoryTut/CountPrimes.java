package leetcode.NumberTheoryTut;

public class CountPrimes {
    public static void main(String[] args) {
        int tillLessThanHowMuch = 5;
        int count = 0;
        int num = 2;
        while (num < tillLessThanHowMuch) {
            if (isPrime(num)) {
                count++;
            }
            num++;
        }
        System.out.println(count);
        System.out.println(countPrimes(tillLessThanHowMuch));
    }
    public static int countPrimes(int n) {
        if (n <= 2)
            return 0;
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i])
                count++;
        }

        return count;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
