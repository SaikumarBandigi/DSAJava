package assignments._2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        String s = "soos", rev = "";
        String original = s;

        int length = s.length();


        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + original.charAt(i);

        if (original.equals(rev)) {
            System.out.println("pali");
        } else {
            System.out.println("not pali");
        }


    }
}
