package leetcode.leetcode75.stack;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Build the multiplier (k)
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push the current multiplier and string to stacks
                countStack.push(k);
                stringStack.push(currentString);
                // Reset for the next substring
                k = 0;
                currentString = new StringBuilder();
            } else if (ch == ']') {
                // Decode the string within brackets
                StringBuilder decodedString = stringStack.pop();
                int currentK = countStack.pop();
                for (int i = 0; i < currentK; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                // Append the current character to the string
                currentString.append(ch);
            }
        }
        return currentString.toString();
    }

    public static void main(String[] args) {
        DecodeString decoder = new DecodeString();
        // Test cases
        System.out.println(decoder.decodeString("11[a]2[bc]")); // Output: "aaabcbc"
        System.out.println(decoder.decodeString("3[a2[c]]")); // Output: "accaccacc"
        System.out.println(decoder.decodeString("2[abc]3[cd]ef")); // Output: "abcabccdcdcdef"
    }
}
