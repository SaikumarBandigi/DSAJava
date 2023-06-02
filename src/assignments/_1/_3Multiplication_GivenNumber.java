package assignments._1;

import java.util.Scanner;

public class _3Multiplication_GivenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }

    }
}
