package gameTut;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for even numbers");
        System.out.println("Press 2 for odd numbers");
        System.out.println("Press 3 for prime numbers");

        int choice = sc.nextInt();
        int N = sc.nextInt();

        if (choice == 1) {
            evenMethod(N);
        } else if (choice == 2) {
            oddMethod(N);
        } else if (choice == 3) {
            printFirstNPrimes(N);
        }
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printFirstNPrimes(int N) {
        if (N < 1) {
            throw new IllegalArgumentException("Please enter a positive value for N");
        }

        int count = 0;
        int i = 2;  // Starting from 2 as 1 is not prime

        while (count < N) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }

    private static void evenMethod(int number) {
        for (int i = 0; i < number; i++) {
            if ((i & 1) == 0) {
                System.out.println(i);
            }
        }
    }

    private static void oddMethod(int number) {
        for (int i = 0; i < number; i++) {
            if ((i & 1) == 1) {
                System.out.println(i);
            }
        }

    }
}
