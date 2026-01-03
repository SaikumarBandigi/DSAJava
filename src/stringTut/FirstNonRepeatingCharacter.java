package stringTut;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s1 = "hello";
        System.out.println(firstNonRepeatingCharacter(s1)); // Output: h

        String s2 = "zxvczbtxyzvy";
        System.out.println(firstNonRepeatingCharacter(s2)); // Output: c

        String s3 = "aabbcc";
        System.out.println(firstNonRepeatingCharacter(s3)); // Output: $
    }

    private static char firstNonRepeatingCharacter(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                return ch;
            }
        }
        return '$';
    }
}
