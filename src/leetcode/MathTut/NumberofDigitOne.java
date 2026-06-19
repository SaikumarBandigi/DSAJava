package leetcode.MathTut;

public class NumberofDigitOne {

    public static void main(String[] args) {
        int n = 9;
        System.out.println(new NumberofDigitOne().countDigitOne(n));
        // System.out.println(new NumberofDigitOne().countDigitOneBruteForce(n));
    }

    public int countDigitOne(int n) {
        long count = 0;

        for (long factor = 1; factor <= n; factor *= 10) {

            long lower = n % factor;
            long current = (n / factor) % 10;
            long higher = n / (factor * 10);

            if (current == 0) {
                count += higher * factor;
            } else if (current == 1) {
                count += higher * factor + lower + 1;
            } else {
                count += (higher + 1) * factor;
            }
        }

        return (int) count;
    }

    public int countDigitOneBruteForce(int n) {

        int count = 0;

        for (int i = 1; i <= n; i++) {
            count += getNumberOfOnes(i);
        }
        return count;
    }

    int getNumberOfOnes(int num) {
        String s = String.valueOf(num);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

}
