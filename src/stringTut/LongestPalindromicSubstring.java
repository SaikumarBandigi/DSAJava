package stringTut;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String str) {
        int n = str.length();
        if (n == 0)
            return "";

        boolean[][] dp = new boolean[n][n];
        int start = 0;
        int maxLength = 1;

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }

        // Check for substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        // Check for substrings of length greater than 2
        for (int k = 3; k <= n; k++) {
            for (int i = 0; i < n - k + 1; i++) {
                int j = i + k - 1;

                // Check if substring str[i...j] is a palindrome
                if (dp[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }

        return str.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String str1 = "aaaabbaa";
      //  System.out.println("Longest palindromic substring in \"" + str1 + "\": " + longestPalindrome(str1));

        String str2 = "abc";
        System.out.println("Longest palindromic substring in \"" + str2 + "\": " + longestPalindrome(str2));
    }
}
