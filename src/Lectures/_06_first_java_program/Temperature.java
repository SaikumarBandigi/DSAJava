package Lectures._06_first_java_program;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        double temp = (num * 1.8) + 32;
        System.out.println(temp);

    }
}
