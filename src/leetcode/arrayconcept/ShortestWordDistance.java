package leetcode.arrayconcept;

public class ShortestWordDistance {

    public static int shortestDistance(String[] words, String word1, String word2) {

        int index1 = -1;
        int index2 = -1;
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                index1 = i;
            }
            if (words[i].equals(word2)) {
                index2 = i;
            }

            if (index1 != -1 && index2 != -1) {
                minDistance = Math.min(minDistance, Math.abs(index1 - index2));
            }
        }

        return minDistance;

    }

    public static void main(String[] args) {

        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding";
        String word2 = "practice";

        int result = shortestDistance(words, word1, word2);
        System.out.println("Shortest distance: " + result);

    }

}
