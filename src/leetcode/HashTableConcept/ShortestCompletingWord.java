package leetcode.HashTableConcept;

public class ShortestCompletingWord {
    public static void main(String[] args) {

        String licensePlate = "1s3 PSt";  // sspt
        String[] words = {"steps", "sspt"};

        System.out.println(new ShortestCompletingWord().shortestCompletingWord(licensePlate, words));
    }

    public String shortestCompletingWord(String licensePlate, String[] words) {

        int[] licenseCount = new int[26];

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


}
