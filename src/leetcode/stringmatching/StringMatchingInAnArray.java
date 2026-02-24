package leetcode.stringmatching;

import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray {
    public static void main(String[] args) {


        String[] words = {"mass", "as", "basis"};
        System.out.println(stringMatching(words));
    }

    public static List<String> stringMatching(String[] words) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i == j) continue;
                if (words[j].contains(words[i])) {
                    result.add(words[i]);
                    break; // avoid duplicate check
                }
            }
        }

        return result;
    }

}
