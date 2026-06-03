package leetcodecontest.weekly.five04;

import java.util.HashMap;
import java.util.Map;

public class DigitFrequencyScore {

    public static void main(String[] args) {
        int n = 122;
        System.out.println(new DigitFrequencyScore().digitFrequencyScore(n));
    }

    public int digitFrequencyScore(int n) {

        Map<Character, Integer> map = new HashMap<>();

        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        int score = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            Integer value = entry.getValue();

            score = score + (key - '0') * value;

        }

        return score;
    }

}
