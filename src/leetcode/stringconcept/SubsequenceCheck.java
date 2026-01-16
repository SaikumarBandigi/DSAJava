package leetcode.stringconcept;

public class SubsequenceCheck {
    public static void main(String[] args) {
        String s = "a";
        String t = "adbnc";

        System.out.println(isSequence(s, t));
    }

    static boolean isSequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

}
