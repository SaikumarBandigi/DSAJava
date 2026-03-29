package leetcode.countingTut;

import java.util.*;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {

        String s = "abccbaacz";
        System.out.println(new FirstLetterToAppearTwice().repeatedCharacter(s));
/*
      'a' - 0, 5 and 6
      'b' - 1 and 4
      'c' - 2, 3 and 7
      'z' -  8
 */
    }

    public char repeatedCharacter(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            map.putIfAbsent(ch, new ArrayList<>());
            map.get(ch).add(i);

            if (map.get(ch).size() == 2) {
                return ch;
            }
        }

        return ' ';
    }

}
