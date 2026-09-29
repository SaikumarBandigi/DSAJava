package leetcode.slidingwindowTut.fixed;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SubstringsofSizeThreewithDistinctCharacters {

    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(
                new SubstringsofSizeThreewithDistinctCharacters().
                        countGoodSubstring(s));
    }

    int countGoodSubstring(String s) {
        if (s.length() < 3) {
            return 0;
        }
        String[] arr = new String[s.length() - 2];

        StringBuilder sb = new StringBuilder();

        int limit = 3;
        for (int i = 0; i < limit; i++) {
            sb.append(s.charAt(i));
        }

        int index = 0;

        arr[index++] = sb.toString();

        for (int i = limit; i < s.length(); i++) {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));
            arr[index++] = sb.toString();
        }

        int count = 0;

        for (String each : arr) {
            if (isNonRepeating(each)) {
                count++;
            }
        }
        return count;
    }

    boolean isNonRepeating(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();
            if (value > 1) {
                return false;
            }
        }
        return true;
    }

}
