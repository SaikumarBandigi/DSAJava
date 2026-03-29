package leetcodecontest.warmup;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {

        String s = "leetcode";
        System.out.println(new FirstUniqueCharacterInAString().firstUniqChar(s));

    }
    /*
    l - 1
    e - 3
    t - 1
    c - 1
    o - 1
    d - 1
     */

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            if (value == 1) {
                return s.indexOf(key);
            }
        }
        return -1;
    }

}
