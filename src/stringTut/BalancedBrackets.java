package stringTut;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while (N-- > 0) {
            String input = sc.next();
            System.out.println(isPar(input) ? "true" : "false");
        }
    }

    private static boolean isPar(String input) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : input.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}


//public class BalancedBrackets {
//
//    // Function to check if brackets are balanced
//    public static boolean ispar(String x) {
//        // Create a stack to keep track of opening brackets
//        Stack<Character> stack = new Stack<>();
//
//        // Iterate through each character in the expression string
//        for (char ch : x.toCharArray()) {
//            // If the character is an opening bracket, push it onto the stack
//            if (ch == '(' || ch == '{' || ch == '[') {
//                stack.push(ch);
//            } else {
//                // If the stack is empty, it means there is no corresponding opening bracket
//                if (stack.isEmpty()) {
//                    return false;
//                }
//                // Pop the top element from the stack
//                char top = stack.pop();
//                // Check if the popped bracket matches the current closing bracket
//                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
//                    return false;
//                }
//            }
//        }
//        // If the stack is empty, all brackets are balanced
//        return stack.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        // Test cases
//        String exp1 = "{([])}";
//        String exp2 = "()";
//        String exp3 = "([)]";
//
//        // Print results
//     //   System.out.println(ispar(exp1) ? "true" : "false"); // true
//        System.out.println(ispar(exp2) ? "true" : "false"); // true
//     //   System.out.println(ispar(exp3) ? "true" : "false"); // false
//    }
//}
