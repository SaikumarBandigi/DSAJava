package leetcode.HashMapTut;

public class Practise {
    public static void main(String[] args) {
        System.out.println(sumOfSquaresOfDigits(123));
    }

    private static int sumOfSquaresOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}
