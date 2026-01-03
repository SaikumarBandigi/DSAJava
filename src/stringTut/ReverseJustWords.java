package stringTut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseJustWords {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        while (t-- > 0) {
            String input = bufferedReader.readLine();
            String result = reverseWords(input);
            System.out.println(result);
        }


    }

    private static String reverseWords(String input) {
        String[] strings = input.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strings) {
            stringBuilder.append(anotherReverse(s).append(" "));
        }
        return stringBuilder.toString();
    }

    private static StringBuilder anotherReverse(String cleanedStr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = cleanedStr.length() - 1; i >= 0; i--) {
            stringBuilder.append(cleanedStr.charAt(i));
        }
        return stringBuilder;
    }

}
