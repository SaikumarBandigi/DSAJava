package leetcode.HashTableConcept;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        String[] words1 = {"Hello", "Alaska", "Dad", "Peace"};
        String[] words2 = {"omk"};
        String[] words3 = {"adsdf", "sfd"};
        String[] words4 = {"dad"};

        System.out.println(Arrays.toString(new Practise().findWords(words1)));
        System.out.println(Arrays.toString(new Practise().findWords(words2)));
        System.out.println(Arrays.toString(new Practise().findWords(words3)));
        System.out.println(Arrays.toString(new Practise().findWords(words4)));
    }

    private String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        return Arrays.stream(words)
                .filter(word -> canBeTyped(word.toLowerCase(), row1) || canBeTyped(word.toLowerCase(), row2)
                        || canBeTyped(word.toLowerCase(), row3)).toArray(String[]::new);
    }

    private boolean canBeTyped(String lowerCase, String row) {
        return lowerCase.chars().allMatch(c -> row.indexOf(c) != -1);
    }


}