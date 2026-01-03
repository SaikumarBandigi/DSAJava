package leetcode.stackConcept;

import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        // Create a stack to hold the opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse the string
        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If it's a closing bracket
            else {
                // If the stack is empty, there's no opening bracket to match
                if (stack.isEmpty()) {
                    return false;
                }
                // Pop the top element and check if it matches the closing bracket
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') ||  (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all the opening brackets were matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParantheses solution = new ValidParantheses();
        System.out.println(solution.isValid("()"));      // true
        System.out.println(solution.isValid("()[]{}"));  // true
        System.out.println(solution.isValid("(]"));      // false
        System.out.println(solution.isValid("([])"));    // true
    }
}
