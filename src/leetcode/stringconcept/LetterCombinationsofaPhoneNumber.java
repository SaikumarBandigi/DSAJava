package leetcode.stringconcept;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(new LetterCombinationsofaPhoneNumber().LetterCombinationsofaPhoneNumber(digits));
    }

    List<String> LetterCombinationsofaPhoneNumber(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        result.add("");

        for (char digit : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            String letters = arr[digit - '0'];

            for (String s : result) {
                for (char ch : letters.toCharArray()) {
                    temp.add(s + ch);
                }
            }
            result = temp;
        }
        return result;
    }

}
