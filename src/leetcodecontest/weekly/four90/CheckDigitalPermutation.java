package leetcodecontest.weekly.four90;

import java.util.Arrays;

public class CheckDigitalPermutation {
    public static void main(String[] args) {
        int num = 415;
        System.out.println(isDigitorialPermutation(num));

    }

    public static boolean isDigitorialPermutation(int n) {

        int original = n;
        int sum = 0;

        // Step 1: Sum of factorials
        while (n > 0) {
            int digit = n % 10;
            sum += fact(digit);
             n /= 10;
        }

        // Step 2: Compare digit permutations
        char[] originalArr = String.valueOf(original).toCharArray();
        char[] sumArr = String.valueOf(sum).toCharArray();

        Arrays.sort(originalArr);
        Arrays.sort(sumArr);

        return Arrays.equals(originalArr, sumArr);
    }


    static int fact(int num) {
        if (num <= 1) return 1;

        int res = 1;
        for (int i = 2; i <= num; i++) {
            res *= i;
        }
        return res;
    }

}
