package leetcode.MathTut;

public class SuperUglyNumber {

    public static void main(String[] args) {

        int n = 12;
        int[] primes = {2, 7, 13, 19};

        System.out.println(new SuperUglyNumber().nthSuperUglyNumber(n, primes));

    }
    public int nthSuperUglyNumber(int n, int[] primes) {

        int count = 0;
        int num = 1;

        while (true) {
            if (isSuperUgly(num, primes)) {
                count++;
                if (count == n) {
                    return num;
                }
            }
            num++;
        }

    }

    boolean isSuperUgly(int n, int[] primes) {

        if (n <= 0) {
            return false;
        }

        for (int prime : primes) {
            while (n % prime == 0) {
                n /= prime;
            }
        }

        return n == 1;
    }

}
