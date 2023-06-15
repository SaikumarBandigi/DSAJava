package assignments._4_functions;

import java.util.Scanner;

public class SumofTwoNumUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("sum of two numbers is: "+sum(n1, n2));
    }

    private static int sum(int n1, int n2) {
        return n1 + n2;
    }
}
