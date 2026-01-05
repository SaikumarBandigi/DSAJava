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
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false
        }
        for (int i = 3; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
