package stanley.hashingTut;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class Example {
    public static void main(String[] args) {

        String s = "abcd";
        int k = 2;

        System.out.println(reversePrefix(s, k));
    }

    public static String reversePrefix(String s, int k) {

        StringBuilder sb = new StringBuilder();
        sb.append(s.substring(0, k));
        String res = sb.toString();
        char[] arr = res.toCharArray();
        reverse(arr, 0, res.length() - 1);

        String remaining = s.substring(k, s.length());

        StringBuilder newSB = new StringBuilder();
        newSB.append(new String(arr));
        newSB.append(remaining);

        return newSB.toString();
    }

    static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
