package stringTut;

import java.util.Stack;

public class RevStringUsingStack {
    public static void main(String[] args) {
        String s = "sai";
        System.out.println(new RevStringUsingStack().reverse(s));
    }

    public String reverse(String S) {
        Stack<Character> stack = new Stack<>();
        for (char ch : S.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = stack.size(); i >= 1; i--) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
