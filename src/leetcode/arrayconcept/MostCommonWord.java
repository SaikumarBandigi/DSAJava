package leetcode.arrayconcept;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(mostCommonWord(paragraph, banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        // Convert banned list to set
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        // Replace punctuation and convert to lowercase
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        // Split words
        String[] words = paragraph.split("\\s+");

        Map<String, Integer> countMap = new HashMap<>();

        String result = "";
        int maxCount = 0;

        for (String word : words) {

            if (!bannedSet.contains(word) && !word.isEmpty()) {

                int count = countMap.getOrDefault(word, 0) + 1;
                countMap.put(word, count);

                if (count > maxCount) {
                    maxCount = count;
                    result = word;
                }
            }
        }
        return result;
    }


}
