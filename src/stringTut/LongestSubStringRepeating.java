package stringTut;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringRepeating {
    public static void main(String[] args) {
        String input1 = "abcabcbb";
        String input2 = "bbbbb";
        String input3 = "pwwkesw";
        String input4 = "saai";

//        System.out.println(longestUniqueSubstring(input1));
//        System.out.println(longestUniqueSubstring(input2));
//        System.out.println(longestUniqueSubstring(input3));
        System.out.println(longestUniqueSubstring(input4));
    }

    private static String longestUniqueSubstring(String input) {
        int n = input.length();
        String longestSubstr = "";
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0;

        while (i < n && j < n) {
            if (!set.contains(input.charAt(j))) {
                set.add(input.charAt(j++));
                if (j - i > longestSubstr.length()) {
                    longestSubstr = input.substring(i, j);
                }
            } else {
                set.remove(input.charAt(i++));
            }
        }
        return longestSubstr;
    }

}
