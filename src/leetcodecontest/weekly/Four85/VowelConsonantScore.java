package leetcodecontest.weekly.Four85;

public class VowelConsonantScore {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(vowelConsonantScore(s));
    }

    public static int vowelConsonantScore(String s) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!Character.isLetter(ch))
                continue; // skip spaces and digits
            if (isVowel(ch)) {
                vowels++;
            } else {
                consonants++;
            }
        }

        if (consonants == 0) return 0; // avoid division by zero

        return vowels / consonants; // integer division automatically floors the result

    }

    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

}
