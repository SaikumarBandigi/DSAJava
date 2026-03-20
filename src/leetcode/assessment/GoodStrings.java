package leetcode.assessment;

import java.util.Arrays;

public class GoodStrings {
    public static void main(String[] args) {

        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(new GoodStrings().countCharacters(words, chars));

    }

    public int countCharacters(String[] words, String chars) {
        int result = 0;

        // frequency of chars
        int[] charFreq = new int[26];
        for (char c : chars.toCharArray()) {
            charFreq[c - 'a']++;
        }

        for (String word : words) {

            int[] wordFreq = new int[26];
            boolean canForm = true;

            for (char c : word.toCharArray()) {
                wordFreq[c - 'a']++;

                if (wordFreq[c - 'a'] > charFreq[c - 'a']) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                result += word.length();
            }
        }

        return result;
    }

}
