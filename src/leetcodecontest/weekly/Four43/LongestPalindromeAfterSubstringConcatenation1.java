package leetcodecontest.weekly.Four43;

public class LongestPalindromeAfterSubstringConcatenation1 {
    public static void main(String[] args) {

        String s = "abcde";
        String t = "ecdba";

        System.out.println(longestPalindrome(s, t));
    }

    public static int longestPalindrome(String s, String t) {

        int max = 0;

        // Case 1: Palindrome inside s
        max = Math.max(max, longestPalinSubstring(s));

        // Case 2: Palindrome inside t
        max = Math.max(max, longestPalinSubstring(t));

        // Case 3: Using both strings
        String revT = new StringBuilder(t).reverse().toString();
        int n = s.length();
        int m = revT.length();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == revT.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, 2 * dp[i][j]);
                }
            }
        }

        return max;
    }

    // Expand Around Center Method
    static int longestPalinSubstring(String str) {
        int n = str.length();
        int maxLen = 0;

        for (int center = 0; center < n; center++) {

            // Odd length
            int l = center, r = center;
            while (l >= 0 && r < n && str.charAt(l) == str.charAt(r)) {
                maxLen = Math.max(maxLen, r - l + 1);
                l--;
                r++;
            }

            // Even length
            l = center;
            r = center + 1;
            while (l >= 0 && r < n && str.charAt(l) == str.charAt(r)) {
                maxLen = Math.max(maxLen, r - l + 1);
                l--;
                r++;
            }
        }

        return maxLen;
    }

}
