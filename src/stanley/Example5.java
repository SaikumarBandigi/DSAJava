package stanley;

import java.util.Arrays;

public class Example5 {

    public static void main(String[] args) {


        String s = "Sa'aS";
        Example5 example = new Example5();
        System.out.println(example.isPalindrome(s));
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        String original = sb.toString();
        String reversed = sb.reverse().toString();

        return original.equals(reversed);
    }

}
