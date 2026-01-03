package jav;

import java.util.Scanner;

public class TakingInput {
    public static void IOFunction() {
        Scanner sc = new Scanner(System.in);
        // Read the inputs
        int a = sc.nextInt();
        float b = sc.nextFloat();
        long c = sc.nextLong();
        byte d = sc.nextByte();
        sc.nextLine();  // Consume the newline character left by nextByte
        String s = sc.nextLine();

        // Print the inputs
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);

        sc.close();
    }

    public static void main(String[] args) {
        IOFunction();
    }
}
