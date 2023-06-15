package assignments._4_functions;

import java.util.Scanner;

public class VoteAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();


        if (age >= 18) {
            System.out.println("eligible for voting...");
        } else {
            System.out.println("not eligible for voting");
        }


    }
}
