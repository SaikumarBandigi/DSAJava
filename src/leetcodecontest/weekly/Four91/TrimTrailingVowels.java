package leetcodecontest.weekly.Four91;

public class TrimTrailingVowels {
    public static void main(String[] args) {

        String s = "daye";
        System.out.println(trimTrailingVowels(s));

    }

    public static String trimTrailingVowels(String s) {

        int i = s.length() - 1;

        // Move backward while character is a vowel
        while (i >= 0 && isVowel(s.charAt(i))) {
            i--;
        }

        // Return substring up to last non-vowel
        return s.substring(0, i + 1);
    }

    static boolean isVowel(char ch) {
        return "AEIOUaeiou".indexOf(ch) != -1;
    }

}
