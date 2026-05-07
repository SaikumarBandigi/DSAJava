package apple;

import java.util.HashSet;
import java.util.Set;

public class Practise {

    public static void main(String[] args) {

        String s = "aabc";
        System.out.println(new Practise().get(s));

    }

    int get(String s) {

        int left = 0;
        int maxLen = 0;

        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(right));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

}
