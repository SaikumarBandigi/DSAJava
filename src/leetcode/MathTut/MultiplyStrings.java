package leetcode.MathTut;

import patternMust.slidingwindow.fixedwindow.max_min_avg.Example;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(new Example().multiply("12", "34"));
    }

    public String multiply(String num1, String num2) {

        // If either number is 0
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        // Multiply each digit from right to left
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;        // current digit
                result[i + j] += sum / 10;           // carry
            }
        }

        // Build answer string (skip leading zeros)
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.isEmpty() && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
    }
}
