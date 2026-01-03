package assignments._5_arrays;

import java.util.Scanner;

public class SandglassPattern {
    public static void main(String[] args) {
        int i, j, k, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        n = sc.nextInt();
        for (i = 0; i <= n - 1; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
            for (k = i; k <= n - 1; k++) {
                System.out.print("*" + " ");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
            System.out.println("");
            try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        }
        for (i = n - 1; i >= 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
            for (k = i; k <= n - 1; k++) {
                System.out.print("*" + " ");
                try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
            System.out.println("");
            try {Thread.sleep(500);} catch (InterruptedException e) {throw new RuntimeException(e);}
        }
        sc.close();
    }
}