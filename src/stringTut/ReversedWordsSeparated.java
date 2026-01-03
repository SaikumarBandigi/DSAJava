package stringTut;


import java.util.Arrays;

public class ReversedWordsSeparated {
    public static void main(String[] args) {
        String input = "Sai Kumar     Bandigi";
        String result = revWordsSep(input);
       System.out.println(result);
    }

    private static String revWordsSep(String input) {
        // Split the input string by spaces and filter out empty strings
        String[] stringArray = input.trim().split(" \\s+");

        StringBuilder stringBuilder = new StringBuilder();
        // Loop to append words in reverse order
        for (int i = stringArray.length - 1; i >= 0; i--) {
            stringBuilder.append(stringArray[i]);
            if (i != 0) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

}
