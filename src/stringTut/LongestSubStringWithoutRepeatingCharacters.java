package stringTut;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        String s = "saso";
        System.out.println(getLongestSubStringWithoutRepeatingCharacters(s));
    }

    private static int getLongestSubStringWithoutRepeatingCharacters(String s) {
        int left = 0;
        int maxLength = 0;

        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(s.charAt(right));

            // Update maximum length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
    public String longestSubstringWithoutRepeating(String s) {
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;
        int startIndex = 0;   // to store starting index of longest substring

        for (int right = 0; right < s.length(); right++) {

            // Remove characters until duplicate is removed
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            // Update longest substring info
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                startIndex = left;
            }
        }

        // Return actual substring
        return s.substring(startIndex, startIndex + maxLength);
    }

}
