package leetcode.stringconcept;

import java.util.HashMap;
import java.util.Map;

public class WeightedWordMapping {

    public static void main(String[] args) {

        String[] words = {"abcd", "def", "xyz"};
        int[] weights = {5, 3, 12, 14, 1, 2, 3, 2, 10, 6, 6, 9, 7, 8, 7, 10, 8, 9, 6, 9, 9, 8, 3, 7, 7, 2};

        System.out.println(new WeightedWordMapping().mapWordWeights(words, weights));

    }

    public String mapWordWeights(String[] words, int[] weights) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            map.put((char) ('a' + i), weights[i]);
        }

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            int totalWeight = getNumberFromWord(map, word);

            int mod = totalWeight % 26;

            sb.append((char) ('z' - mod));
        }

        return sb.toString();
    }

    int getNumberFromWord(Map<Character, Integer> map, String word) {
        int sum = 0;
        for (char c : word.toCharArray()) {
            sum += map.get(c);
        }
        return sum;
    }

}
