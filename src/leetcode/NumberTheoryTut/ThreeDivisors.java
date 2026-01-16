package leetcode.NumberTheoryTut;

public class ThreeDivisors {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(new ThreeDivisors().isThree(n));
    }

    public boolean isThree(int n) {

        if (isPrime(n)) {
            return false;
        }

        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 3;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
