package leetcode.stringconcept;

public class DetectCapital {

    public static void main(String[] args) {

        String s = "USA";
        System.out.println(new DetectCapital().detectCapitalUse(s));

    }

    public boolean detectCapitalUse(String word) {

        // Case 1: ALL CAPS
        if (word.equals(word.toUpperCase())) {
            return true;
        }

        // Case 2: all small
        if (word.equals(word.toLowerCase())) {
            return true;
        }

        // Case 3: First letter capital only
        if (Character.isUpperCase(word.charAt(0)) &&
                word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }

        return false;
    }


}
