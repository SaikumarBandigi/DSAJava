package leetcode.HashTableConcept;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {
    public static void main(String[] args) {

        String licensePlate = "1s3 PSt";  // sspt
        String[] words = {"steps", "sspt"};  // another word spt

        System.out.println(new ShortestCompletingWord().shortestCompletingWord(licensePlate, words));
        System.out.println(
                new ShortestCompletingWord().shortestCompletingWordHashMap("1s3 PSt", new String[]{"sspt"}));
    }


    public String shortestCompletingWord(String licensePlate, String[] words) {

        int[] licenseCount = new int[26];  // sspt

        // Count letters in license plate
        for (char c : licensePlate.toCharArray()) {
            if (Character.isLetter(c)) {
                licenseCount[Character.toLowerCase(c) - 'a']++;
            }
        }

        String result = null;

        for (String word : words) {
            int[] wordCount = new int[26];

            for (char c : word.toCharArray()) {
                wordCount[c - 'a']++;
            }

            if (isValid(licenseCount, wordCount)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }

    private boolean isValid(int[] license, int[] word) {
        for (int i = 0; i < 26; i++) {
            if (word[i] < license[i]) {
                return false;
            }
        }
        return true;
    }

    public String shortestCompletingWordHashMap(String licensePlate, String[] words) {

        HashMap<Character, Integer> licenseMap = new HashMap<>();  // s-2 p-1 t-1

        // Build frequency map for license plate
        for (char c : licensePlate.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                licenseMap.put(c, licenseMap.getOrDefault(c, 0) + 1);
            }
        }

        String result = null;

        for (String word : words) {
            HashMap<Character, Integer> wordMap = new HashMap<>();  // s-2 p-1 t-1

            for (char c : word.toCharArray()) {
                wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
            }

            if (isValidUsingtHashMap(licenseMap, wordMap)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        return result;
    }

    private boolean isValidUsingtHashMap(HashMap<Character, Integer> licenseMap, HashMap<Character, Integer> wordMap) {

        for (Map.Entry<Character, Integer> entry : licenseMap.entrySet()) {  // sspt

            char lKey = entry.getKey();
            int lValue = entry.getValue();

            int wValue = wordMap.getOrDefault(lKey, 0);

            if (wValue < lValue) {
                return false;
            }
        }

        return true;
    }


}
