package gameTut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 for even numbers");
        System.out.println("press 2 for odd numbers");
        System.out.println("press 3 for prime numbers");

        int N = sc.nextInt();
        int number = sc.nextInt();

        if (N == 1) {
            printFirstNEvens(number);
        } else if (N == 2) {
            printFirstNOdds(number);
        } else if (N == 3) {
            printFirstNPrimes(number);
        }

    }

    private static void printFirstNPrimes(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("soryy..");
        }

        int count = 0;
        int i = 2;

        while (count < number) {
            if (isPrimeMethod(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

    private static boolean isPrimeMethod(int num) {
        if (num < 1) {
            throw new IllegalArgumentException("sorry....");
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printFirstNOdds(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("soryy..");
        }

        int count = 0;
        int i = 0;

        while (count < number) {
            if (isOddMethod(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

    private static boolean isOddMethod(int i) {
        return (i & 1) == 1;
    }

    private static void printFirstNEvens(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("soryy..");
        }

        int count = 0;
        int i = 0;

        while (count < number) {
            if (isEvenMethod(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

    private static boolean isEvenMethod(int count) {
        return (count & 1) == 0;
    }

}
