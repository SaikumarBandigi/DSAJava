package leetcode.leetcode75.array_string;

import java.util.Stack;

public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String s = "abcde"; // e e o e -> e o e e -> leotcede
        System.out.println(reverseVowelsUsingStack(s));
    }

    public static String reverseVowelsUsingStack(String s) {
        // Create a stack to store the vowels
        Stack<Character> vowels = new Stack<>();

        // First pass: Add vowels to the stack
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.push(c);
            }
        }

        // Second pass: Replace vowels in the string with those popped from the stack
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                result.append(vowels.pop());
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
}
