package leetcode.stringconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindResultantArrayAfterRemovingAnagrams {

    public static void main(String[] args) {

        String[] words = {"abba", "baba", "bbaa", "cd", "cd"};
        System.out.println(new FindResultantArrayAfterRemovingAnagrams().removeAnagrams(words));

    }

    public List<String> removeAnagrams(String[] words) {

        List<String> result = new ArrayList<>();

        result.add(words[0]);
        String prev = sortWord(words[0]);

        for (int i = 1; i < words.length; i++) {

            String current = sortWord(words[i]);

            if (!current.equals(prev)) {
                result.add(words[i]);
                prev = current;
            }
        }

        return result;
    }

    private String sortWord(String word) {
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

}
