package leetcode.stackConcept;

public class LengthOfTheLastWord {
    public static void main(String[] args) {

        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfTheLastWord(s));
    }

    private static int lengthOfTheLastWord(String s) {
        String str = s.trim();
        String[] stringArray = str.split(" ");
        int arrLength = stringArray.length;
        return stringArray[arrLength - 1].length();
    }

}
