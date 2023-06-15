package Lectures.arraysandarraylist;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] s = new String[4];

        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextLine();
        }

        for( String i:s)
            System.out.println(i);

    }
}
