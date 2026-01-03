package leetcode.stringconcept;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'s', 'a', 'i'};
        new ReverseString().reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            // Swap the characters at the left and right indices
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            // Move towards the middle
            left++;
            right--;
        }
    }

}
