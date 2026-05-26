package leetcode.stringconcept;

import java.util.HashSet;
import java.util.Set;

public class CounttheNumberofSpecialCharactersI {

    public static void main(String[] args) {

        String s = "aaAbcBC";
        System.out.println(new CounttheNumberofSpecialCharactersI().numberOfSpecialChars(s));

    }

    public int numberOfSpecialChars(String word) {

        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();

        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                lower.add(ch);
            } else {
                upper.add(ch);
            }
        }

        int count = 0;

        for (char ch : lower) {
            if (upper.contains(Character.toUpperCase(ch))) {
                count++;
            }
        }

        return count;
    }

}
