package Lectures.patterns;

import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {

//        String s = "lool";
//
//        String rev = "";
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            rev = rev + s.charAt(i);
//        }
//
//        System.out.println(s.equals(rev) ? "palindrome" : "Not palindrome");


        //////////

        String str = "lool";
        System.out.println(isPali(str));
    }

    private static boolean isPali(String str) {
        str = str.toLowerCase();

        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }
        return true;

    }}