package interviewTut.stringTut;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        String s = "ababcdde";
        System.out.println(new FirstNonRepeatingCharacter().getFirstNonRepeatingCharacter(s));
    }

    Character getFirstNonRepeatingCharacter(String s) {

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '-';
    }

}
