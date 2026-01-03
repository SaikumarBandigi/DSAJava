package stringTut;

public class PractiseHere {
    public static void main(String[] args) {

        isCharacterIsVowel('a');

    }

    private static boolean isCharacterIsVowel(Character c) {
        if ("aeiouAEIOU".indexOf(c) != -1) {
            return true;
        } else {
            return false;
        }
    }

}
