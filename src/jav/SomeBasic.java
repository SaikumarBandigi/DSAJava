package jav;

import java.util.Scanner;

public class SomeBasic {
    public static void main(String[] args) {
        SomeBasic.getInput();
    }

    static void getInput() {
        Scanner sc = new Scanner(System.in);
        // Read the integer input
        int number = sc.nextInt();

        // Clear the input buffer
        sc.nextLine(); // This clears the newline character after the integer input

        // Read the full line of string input
        String text = sc.nextLine();

        // Print the outputs as per the problem statement
        System.out.println(number);
        System.out.println(text);
    }

}
