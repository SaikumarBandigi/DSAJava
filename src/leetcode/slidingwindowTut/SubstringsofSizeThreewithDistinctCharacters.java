package leetcode.slidingwindowTut;


import java.util.HashSet;
import java.util.Set;

public class SubstringsofSizeThreewithDistinctCharacters {

    public static void main(String[] args) {

        String s = "xyzzaz";
        System.out.println(new SubstringsofSizeThreewithDistinctCharacters().countGoodSubstrings(s));

    }

    public int countGoodSubstrings(String s) {
        if (s.length() < 3) return 0;
        String[] arr = new String[s.length() - 2];

        for (int i = 0; i < s.length() - 2; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = i; j < i + 3 && j < s.length(); j++) {
                //   substring.append(s.charAt(j));
                word.append(s.charAt(j));
            }
            arr[i] = word.toString();
        }

        int count = 0;

        for (String string : arr) {
            if (isStringGood(string)) {
                count++;
            }
        }

        return count;
    }

    boolean isStringGood(String s) {
        Set<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (!set.add(ch)) {
                return false;
            }
        }
        return true;
    }

}
