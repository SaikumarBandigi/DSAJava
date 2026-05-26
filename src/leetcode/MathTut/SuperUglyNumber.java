package leetcode.MathTut;

public class SuperUglyNumber {

    public static void main(String[] args) {

        int n = 1_00_000;
        int[] primes = {7, 19, 29, 37, 41, 47, 53, 59, 61, 79, 83, 89, 101, 103, 109, 127, 131, 137, 139, 157, 167, 179, 181, 199, 211, 229, 233, 239, 241, 251};

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
