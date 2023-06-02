package assignments._1;
/*

HCF (Highest Common Factor) and LCM (Least Common Multiple) are mathematical concepts
 related to finding common factors or multiples of two or more numbers.

HCF->
 For example, let's consider the numbers 12 and 18. The factors of 12 are 1, 2, 3, 4, 6, and 12. The factors of 18 are 1, 2, 3, 6, 9, and 18.
 The common factors of 12 and 18 are 1, 2, 3, and 6. Among these common factors, the largest one is 6. Therefore, the HCF of 12 and 18 is 6.

LCM->
For example, let's consider the numbers 4 and 6. The multiples of 4 are 4, 8, 12, 16, 20, 24, and so on. The multiples of 6 are 6, 12, 18, 24, 30, 36, and so on.
The common multiples of 4 and 6 are 12, 24, 36, and so on. Among these common multiples, the smallest one is 12. Therefore, the LCM of 4 and 6 is 12.

 */

import java.util.Scanner;

public class _4HCF_LCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Calculate HCF
        int hcf = calculateHCF(number1, number2);

        // Calculate LCM
        int lcm = calculateLCM(number1, number2, hcf);

        System.out.println("HCF of " + number1 + " and " + number2 + " is: " + hcf);
        System.out.println("LCM of " + number1 + " and " + number2 + " is: " + lcm);
    }

    // Function to calculate HCF
    public static int calculateHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    // Function to calculate LCM
    public static int calculateLCM(int num1, int num2, int hcf) {
        return (num1 * num2) / hcf;
    }
}

