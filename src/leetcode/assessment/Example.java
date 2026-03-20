package leetcode.assessment;

import java.util.HashMap;

public class Example {

    public static void main(String[] args) {

        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        System.out.println(new Example().get(words, chars));

    }

    int get(String[] words, String chars) {

        int count = 0;

        HashMap<Character, Integer> charsMap = new HashMap<>();

        for (char ch : chars.toCharArray()) {
            charsMap.put(ch, charsMap.getOrDefault(ch, 0) + 1);
        }

        for (String word : words) {
            HashMap<Character, Integer> wordMap = new HashMap<>();
            boolean canForm = true;

            for (char ch : word.toCharArray()) {
                wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
                if (wordMap.get(ch) > charsMap.getOrDefault(ch, 0)) {
                    canForm = false;
                    break;

                }
            }
            if (canForm) {
                count += word.length();
            }
        }
        return count;
    }

}
