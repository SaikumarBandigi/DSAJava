package leetcodecontest.weekly.five03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PasswordStrength {

    public static void main(String[] args) {

        String password = "bbB11#";
        System.out.println(new PasswordStrength().passwordStrength(password));

    }

    public int passwordStrength(String password) {

        Set<Character> set = new HashSet<>();

        for (char c : password.toCharArray()) {
            set.add(c);
        }

        char[] chars = new char[set.size()];

        int i = 0;

        for (char ch : set) {
            chars[i++] = ch;
        }


        int result = 0;

        for (char ch : chars) {
            result += getPoints(ch);
        }

        return result;
    }

    public int getPoints(char ch) {

        if (Character.isLowerCase(ch)) {
            return 1;
        }

        if (Character.isUpperCase(ch)) {
            return 2;
        }

        if (Character.isDigit(ch)) {
            return 3;
        }

        if ("!@#$".indexOf(ch) != -1) {
            return 5;
        }

        return 0;
    }


}
