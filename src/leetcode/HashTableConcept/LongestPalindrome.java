package leetcode.HashTableConcept;

import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {

        String s = "abbac";
        System.out.println(new LongestPalindrome().longestPalindrome(s));
        System.out.println(new LongestPalindrome().longestPalindromeBeatsOptimal(s));

    }

    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();  // a-2 b-2

        // Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder left = new StringBuilder();
        String middle = "";

        for (char c : map.keySet()) {
            int count = map.get(c); // 2
            // add pairs
            left.append(
                    String.valueOf(c).repeat(Math.max(0, count / 2))
            );
            // store one odd character for center
            if (count % 2 == 1 && middle.equals("")) {
                middle = String.valueOf(c);
            }
        }

        String r = left.reverse().toString();
        String l = left.toString();
        return (l + middle + r).length();
    }

    public int longestPalindromeBeatsOptimal(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : map.values()) {

            length += (count / 2) * 2;

            if (count % 2 == 1) {
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length += 1;
        }

        return length;
    }

}
