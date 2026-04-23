package leetcode.MathTut;

import java.math.BigInteger;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {

        int num = 10_000;
        System.out.println(new FactorialTrailingZeroes().trailingZeroesBruteForce(num));
    }

    public int trailingZeroesBruteForce(int n) {
        BigInteger fact = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        int count = 0;
        while (fact.mod(BigInteger.TEN).equals(BigInteger.ZERO)) {
            count++;
            fact = fact.divide(BigInteger.TEN);
        }
        return count;
    }

}
