package leetcode.leetcode75.hashmap_set;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {
        // If the lengths of the two words are different, they cannot be close
        if (word1.length() != word2.length()) {
            return false;
        }

        // Create frequency arrays for both strings
        int[] freq1 = new int[26]; // For word1
        int[] freq2 = new int[26]; // For word2

        // Create sets of characters that appear in both strings
        boolean[] charSet1 = new boolean[26]; // Characters in word1
        boolean[] charSet2 = new boolean[26]; // Characters in word2

        // Populate frequency arrays and character sets
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
            charSet1[c - 'a'] = true;
        }
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
            charSet2[c - 'a'] = true;
        }

        // Check if both strings have the same set of characters
        if (!Arrays.equals(charSet1, charSet2)) {
            return false;
        }

        // Sort the frequency arrays
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        // Check if both strings have the same frequency distribution
        return Arrays.equals(freq1, freq2);
    }

    public static void main(String[] args) {
        // Test cases
        String word1 = "abc", word2 = "bca";
        System.out.println(closeStrings(word1, word2)); // Output: true

        word1 = "a";
        word2 = "aa";
        System.out.println(closeStrings(word1, word2)); // Output: false

        word1 = "cabbba";
        word2 = "abbccc";
        System.out.println(closeStrings(word1, word2)); // Output: true

        word1 = "aabbcc";
        word2 = "bbccee";
        System.out.println(closeStrings(word1, word2)); // Output: false
    }
}
