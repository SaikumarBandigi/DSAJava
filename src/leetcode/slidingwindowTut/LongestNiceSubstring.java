package leetcode.slidingwindowTut;

import java.util.HashSet;
import java.util.Set;

public class LongestNiceSubstring {
    public static void main(String[] args) {

        String s = "YazaAay";  // 7 (0 - 6) (res - 3,4,5)
        //YazaAay
        System.out.println(getLongestNiceSubstringUsingRecursive(s)); // aAa
        System.out.println(longestNiceSubstringSlidingWindow(s));  // aAa
    }

    static String getLongestNiceSubstringUsingRecursive(String s) {
        if (s.length() < 2) return "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // If character is not "nice" in this substring
            if (s.indexOf(Character.toLowerCase(c)) == -1 || s.indexOf(Character.toUpperCase(c)) == -1) {
                String left = getLongestNiceSubstringUsingRecursive(s.substring(0, i));
                String right = getLongestNiceSubstringUsingRecursive(s.substring(i + 1));
                return left.length() >= right.length() ? left : right;
            }
        }
        // All characters are "nice"
        return s;
    }

    public static String longestNiceSubstringSlidingWindow(String s) {   // YazaAay
        if (s.length() < 2) return "";
        if (s.length() == 2 && isNice(s)) return s;

        int n = s.length();
        String result = "";

        // Try all window sizes from 2 to n
        for (int windowSize = 2; windowSize <= n; windowSize++) {
            for (int start = 0; start <= n - windowSize; start++) {
                String sub = s.substring(start, start + windowSize);
                if (isNice(sub) && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }

        return result;
    }

    // Check if substring is nice
    private static boolean isNice(String s) { // aAa
        Set<Character> set = new HashSet<>(); // aA
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (char c : s.toCharArray()) {
            if (!(set.contains(Character.toLowerCase(c)) && set.contains(Character.toUpperCase(c)))) {
                return false;
            }
        }
        return true;
    }


}
