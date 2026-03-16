package leetcode.countingTut;

import java.util.HashMap;
import java.util.Map;

public class RearrangeCharactersToMakeTargetString {
    public static void main(String[] args) {

        String s = "saiia", target = "sai";
        System.out.println(new RearrangeCharactersToMakeTargetString().rearrangeCharacters(s, target));

    }

    public int rearrangeCharacters(String s, String target) {

        Map<Character, Integer> sMap = new HashMap<>();  // s-3 a-2 i-2
        Map<Character, Integer> tMap = new HashMap<>();  // s-1 a-1 i-1

        for (char ch : s.toCharArray()) {
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        for (char ch : target.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        int result = Integer.MAX_VALUE;

        for (char ch : tMap.keySet()) {
            int countInS = sMap.getOrDefault(ch, 0);
            int countInTarget = tMap.get(ch);
            result = Math.min(result, countInS / countInTarget);
        }

        return result;
    }

}
