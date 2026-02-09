package leetcode.stringconcept;

import java.util.HashMap;
import java.util.Map;

public class FindFirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "sai";

        System.out.println(new FindFirstUniqueCharacterInAString().firstUniqCharIndex(s));
        System.out.println(new FindFirstUniqueCharacterInAString().firstUniqChar(s));

    }

    public int firstUniqCharIndex(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return '\0';
    }

}
