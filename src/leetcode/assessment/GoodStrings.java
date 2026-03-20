package leetcode.assessment;

import java.util.Arrays;
import java.util.HashMap;

public class GoodStrings {
    public static void main(String[] args) {

        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(new GoodStrings().countCharactersUsingArray(words, chars));
        System.out.println(new GoodStrings().countCharactersUsingHashMap(words, chars));

    }

    public int countCharactersUsingArray(String[] words, String chars) {
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

    public int countCharactersUsingHashMap(String[] words, String chars) {

        int result = 0;

        // Frequency map for chars
        HashMap<Character, Integer> charMap = new HashMap<>();  // a-2 c-1 h-1 t-1
        for (char ch : chars.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        for (String word : words) {// cat hat
            HashMap<Character, Integer> wordMap = new HashMap<>();
            boolean canForm = true;

            for (char ch : word.toCharArray()) {
                wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
                if (wordMap.get(ch) > charMap.getOrDefault(ch, 0)) {
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
