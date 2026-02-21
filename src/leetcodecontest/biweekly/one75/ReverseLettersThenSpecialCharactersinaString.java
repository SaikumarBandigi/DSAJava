package leetcodecontest.biweekly.one75;

import java.util.Stack;

public class ReverseLettersThenSpecialCharactersinaString {
    public static String reverseLetters(String s) { // a,b$c -> c$b,a

        // c b a
        // $ ,
        // c$b,a

        char[] arr = s.toCharArray();
        Stack<Character> letters = new Stack<>();  // a b c
        Stack<Character> specials = new Stack<>();  // , $

        // Separate letters and special characters
        for (char c : arr) {
            if (Character.isLetter(c)) {
                letters.push(c);
            } else {
                specials.push(c);
            }
        }

        // Rebuild the string
        for (int i = 0; i < arr.length; i++) {
            if (Character.isLetter(arr[i])) {
                arr[i] = letters.pop();  // Reverse letters
            } else {
                arr[i] = specials.pop(); // Reverse specials
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String input = "a,b$c";
        String result = reverseLetters(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed letters: " + result);

    }
}
