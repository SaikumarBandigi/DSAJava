package Lectures._06_contions_loops;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        int a = 0;
//        int b = 1;
//
//        int count = 2;
//
//
//        while (count <= n) {
//            int temp = b;
//            b = b + a;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);


        /*  best */

//        int a = 0;
//        int b = 1;
//
//        int c;
//
//
//        int number = 9;
//
//
//        if (number == 0) {
//            System.out.print(a);
//        } else {
//            System.out.print(a + " " + b);
//
//            for (int n = 2; n <= number; n++) {
//
//                c = a + b;
//                System.out.print(" " + c);
//                a = b;
//                b = c;
//            }
//        }



        /* practise */


        int num = 5;

        int a = 0;
        int b = 1;

        int count = 2;

        while (count <= num) {

            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }

        System.out.println(b);

    }
}
