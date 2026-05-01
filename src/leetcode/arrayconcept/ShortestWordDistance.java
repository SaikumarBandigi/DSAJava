package leetcode.arrayconcept;

public class ShortestWordDistance {

    public static int shortestDistance(String[] words, String word1, String word2) {

        int Word1index1 = -1;
        int Word2index2 = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                Word1index1 = i;
            }
            if (words[i].equals(word2)) {
                Word2index2 = i;
            }

            if (Word1index1 != -1 && Word2index2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(Word1index1 - Word2index2));
            }
        }

        return minDistance;

    }

    public static void main(String[] args) {

        String[] words = {"sai", "sai", "perfect", "isha"};
        String word1 = "sai";
        String word2 = "isha";

        int result = shortestDistance(words, word1, word2);
        System.out.println("Shortest distance: " + result);

    }

}
