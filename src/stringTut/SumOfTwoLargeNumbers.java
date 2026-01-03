package stringTut;

import java.util.Stack;

public class SumOfTwoLargeNumbers {
    public static void main(String[] args) {
        System.out.println(findSum("10", "10"));
    }
    public static String findSum(String X, String Y) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        for(int i = 0; i < X.length(); i++)
            s1.push(X.charAt(i) - '0');
        for(int i = 0; i < Y.length(); i++)
            s2.push(Y.charAt(i) - '0');
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while(!s1.isEmpty() || !s2.isEmpty()){
            int sum = 0;
            if(!s1.isEmpty()){
                sum += s1.pop();
            }
            if(!s2.isEmpty()){
                sum += s2.pop();
            }
            sum += carry;
            carry = sum / 10;
            res.insert(0, sum % 10);
        }
        if(carry == 1) res.insert(0, 1);
        // removing all the leading 0s;
        int i = 0;
        while(i < res.length() && res.charAt(i) == '0') i++;
        String ans = res.substring(i);
        return ans.isEmpty() ? "0" : ans;
    }
}
