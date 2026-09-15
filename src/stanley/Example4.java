package stanley;

import java.util.HashMap;
import java.util.Map;

public class Example4 {

    public static void main(String[] args) {

        String ransomNote = "a", magazine = "aa";
        System.out.println(new Example4().canConstruct(ransomNote, magazine));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : magazine.toCharArray()) {  // b -> 1
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : ransomNote.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char ch = entry.getKey();
            int value = entry.getValue();
            if (value < 0) {
                return false;
            }
        }

        return true;
    }

}
