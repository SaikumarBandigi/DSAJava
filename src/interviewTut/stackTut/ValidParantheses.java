package interviewTut.stackTut;

import java.util.Stack;

public class ValidParantheses {

    public static void main(String[] args) {

        String s = "()";
        System.out.println(new ValidParantheses().isParanthesesValid(s));

    }

    boolean isParanthesesValid(String s) {

        if (s.length() <= 1) return false;

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(' || ch == '}' && top != '{' || ch == ']' && top != '[') {
                    return false;
                }
            }
        }
        return true;
    }

}
