package assignments._4_functions;

import java.util.Scanner;

public class MaxMinThreeNumsUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = Max(num1, num2, num3);
        int min = Min(num1, num2, num3);

        System.out.println(max);
        System.out.println(min);
    }
    private static int Max(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3) {
            return num2;
        }
        return num3;
    }

    private static int Min(int num1, int num2, int num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        } else if (num2 < num3) {
            return num2;
        }
        return num3;
    }
}
