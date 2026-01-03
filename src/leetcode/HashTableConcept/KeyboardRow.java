package leetcode.HashTableConcept;

import java.util.*;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] words1 = {"Hello", "Alaska", "Dad", "Peace"};
        String[] words2 = {"omk"};
        String[] words3 = {"adsdf", "sfd"};

        System.out.println(Arrays.toString(new KeyboardRow().findWords(words1)));
        System.out.println(Arrays.toString(new KeyboardRow().findWords(words2)));
        System.out.println(Arrays.toString(new KeyboardRow().findWords(words3)));
    }

    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        List<String> result = new ArrayList<>();

        for (String word : words) {
            if (canBeTyped(word.toLowerCase(), row1) || canBeTyped(word.toLowerCase(), row2) ||
                    canBeTyped(word.toLowerCase(), row3)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    private boolean canBeTyped(String word, String row) {
        for (char c : word.toCharArray()) {
            if (!row.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

}
