package leetcode.leetcode75.array_string;

public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String str1 = "ABCABC", str2 = "ABC";
        GreatestCommonDivisorOfStrings greatestCommonDivisorOfStrings = new GreatestCommonDivisorOfStrings();
        System.out.println(greatestCommonDivisorOfStrings.gcdOfStrings(str1, str2));
    }

    public String gcdOfStrings(String str1, String str2) {
        // Check if str1 + str2 equals str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; // No common divisor exists
        }

        // Calculate GCD of lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring of str1 (or str2) of length gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper method to calculate GCD using Euclidean algorithm
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }


}
