package leetcode.stringconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "komal";
        System.out.println(reverseVow(s));
    }

    static String reverseVow(String s) {
        List<Character> vowels = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowels.add(ch);
            }
        }
        Collections.reverse(vowels);
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                stringBuilder.append(vowels.remove(0));
            } else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }

    static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
