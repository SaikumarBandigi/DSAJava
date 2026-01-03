package stringTut;


import java.util.Arrays;

// Given a String S, reverse the string without reversing its individual words. Words are separated by dots
public class ReverseWords {
    public static void main(String[] args) {
        String input = "pqr.mno";
        wordsReverse(input);
        System.out.println(wordsReverse(input));
    }

    private static String wordsReverse(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] stringArray = input.split("\\.");
        for (int i = stringArray.length - 1; i >= 0; i--) {
            stringBuilder.append(stringArray[i]);
            if (i != 0) {
                stringBuilder.append(".");
            }
        }
        return stringBuilder.toString();
    }

}
