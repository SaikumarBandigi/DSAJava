package assignments._4_functions;

import java.util.Scanner;

public class ProductofTwoNumUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Product of two numbers is: "+Product(n1, n2));
    }

    private static int Product(int n1, int n2) {
        return n1 * n2;
    }
}
