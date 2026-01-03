package stringTut;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        String str = "abca";
        System.out.println(getLongestString(str));
    }

    private static int getLongestString(String str) {
        int left = 0;
        int maxlength = 0;

        Set<Character> set = new HashSet<>();
        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}
