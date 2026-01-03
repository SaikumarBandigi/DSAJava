package assignments._5_arrays;

import java.util.Arrays;

public class ToggleStringCase {
    public static void main(String[] args) {

        String input = "aPpLe";
        String result = toggleStringCase(input);
        System.out.println(result);
    }

    public static String toggleStringCase(String str) {

        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isUpperCase(c)) {
                chars[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                chars[i] = Character.toUpperCase(c);
            }
        }
        return new String(chars);
    }
}
