package leetcode.leetcode75.stack;

import java.util.Stack;

public class RemovingStarsFromAStringWithStack {
    public static void main(String[] args) {
        String s1 = "leet**cod*e";
        System.out.println(removeStars(s1)); // Output: "lecoe"

        String s2 = "erase*****";
        System.out.println(removeStars(s2)); // Output: ""
    }

    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(c);
            }

        }

        StringBuilder res = new StringBuilder();

        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.reverse().toString();
    }
}
