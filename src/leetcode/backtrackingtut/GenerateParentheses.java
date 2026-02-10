package leetcode.backtrackingtut;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int n) {

        // Base condition
        if (current.length() == n * 2) {
            result.add(current);
            return;
        }

        // Choose "("
        if (open < n) {
            backtrack(result, current + "(", open + 1, close, n);
        }

        // Choose ")"
        if (close < open) {
            backtrack(result, current + ")", open, close + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 1;
        List<String> ans = generateParenthesis(n);

        System.out.println("Valid Parentheses Combinations:");
        for (String s : ans) {
            System.out.println(s);
        }
    }


}
