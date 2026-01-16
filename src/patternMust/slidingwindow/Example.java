package patternMust.slidingwindow;

import java.util.Arrays;
import java.util.Comparator;

public class Example {
    public static void main(String[] args) {

        String sentence = "is2 Thi1s a3";
        System.out.println(sortSentence(sentence));

    }

    public static String sortSentence(String s) {
        // Step 1: Split into words
        String[] words = s.split(" ");

        Arrays.sort(words, new WordPositionComparator());

        // Step 3: Remove numbers and join the words
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\d", "");
        }

        return String.join(" ", words);
    }

    public static String sortSentencee(String s) {
        // Step 1: Split into words
        String[] words = s.split(" ");

        // Step 2: Sort words based on the number in each word
        Arrays.sort(words, (a, b) -> {
            // Extract the number from the word
            int numA = a.chars().filter(Character::isDigit).findFirst().getAsInt();
            int numB = b.chars().filter(Character::isDigit).findFirst().getAsInt();
            return numA - numB;
        });

        // Step 3: Remove numbers and join the words
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\d", "");
        }

        return String.join(" ", words);
    }

}

class WordPositionComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        int posA = extractNumber(a);
        int posB = extractNumber(b);
        return posA - posB;
    }

    private int extractNumber(String word) {
        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch)) {
                return ch - '0';
            }
        }
        return 0; // safety
    }

}

