package stringTut;

import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String input1 = "geeksforgeeks";
        String input2 = "forgeeksgeeks";
        System.out.println(isAnagram(input1,input2));
    }

    private static boolean isAnagram(String input1, String input2) {
        String newInput1 = sortString(input1);
        String newInput2 = sortString(input2);
        return newInput1.equals(newInput2);
    }

    public static String sortString(String input) {
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
