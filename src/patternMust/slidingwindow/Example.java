package patternMust.slidingwindow;

import java.util.Arrays;
import java.util.Comparator;

public class Example {
    public static void main(String[] args) {

        String sentence = "is2 Thi1s a3";
        System.out.println(sortSentence(sentence));
    }


    static String sortSentence(String word) {

        String[] words = word.split(" ");

        Arrays.sort(words, new WordPositionComparator());

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\d", "");
        }
        return String.join(" ", words);
    }

}

class WordPositionComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int posA = getNumber(o1);
        int posB = getNumber(o2);
        return posA - posB;
    }

    int getNumber(String word) {
        for (char ch : word.toCharArray()) {
            if (Character.isDigit(ch)) {
                return ch - '0';
            }
        }
        return 0;
    }

}



