package stringTut;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s = "zvvo";
        System.out.println(removeDups(s));
    }

    static String removeDups(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : map.keySet()) {
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
