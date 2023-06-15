package Lectures._06_contions_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        while (true) {
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {

                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (ch == '+') {
                    System.out.println(num1 + num2);
                }
                if (ch == '-') {
                    System.out.println(num1 - num2);
                }
                if (ch == '*') {
                    System.out.println(num1 * num2);
                }
                if (ch == '/') {
                    System.out.println(num1 / num2);
                }
                if (ch == '%') {
                    System.out.println(num1 % num2);
                }

            } else if (ch == 'X' || ch == 'x') {
                System.out.println("khatam");
                break;
            } else {
                System.out.println("wrong input");
                break;
            }
        }


    }
}
