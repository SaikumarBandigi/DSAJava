package leetcode.stringconcept;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {

        String s = "abcca";
        System.out.println(new FirstLetterToAppearTwice().repeatedCharacter(s));

    }

    public char repeatedCharacter(String s) {
        Set<Character> seen = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (seen.contains(ch)) {
                return ch;
            }
            seen.add(ch);
        }

        return '\0'; // if no repeated character
    }

}
