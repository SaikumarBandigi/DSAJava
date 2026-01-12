package stringTut;

import java.util.*;


public class LetterCombinationsofaPhoneNumber {
    private static final Map<Character, String> map = new HashMap<>();

    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(new LetterCombinationsofaPhoneNumber().letterCombinationss(digits));
    }

    public List<String> c(String digits) {
        List<String> result = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return result;
        }

        backtrack(0, digits, new StringBuilder(), result);
        return result;
    }

    private void backtrack(int index, String digits, StringBuilder current, List<String> result) {
        // Base case
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = map.get(digits.charAt(index));

        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(index + 1, digits, current, result);
            current.deleteCharAt(current.length() - 1); // backtrack
        }
    }

    public List<String> letterCombinationss(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }

        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        result.add("");


        for (char digit : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            String alphabetsTogether = keypad[digit - '0'];

            for (String s : result) {
                for (char alphabet : alphabetsTogether.toCharArray()) {
                    temp.add(s + alphabet);
                }
            }
            result = temp;
        }
        return result;
    }

}
