package assignments._2;

import java.util.Scanner;

public class ArmstrongBetween {
    public static void main(String[] args) {
//        int num = 370;
//        boolean res = find(num);
        //  System.out.println(res);

        System.out.println("enter two numbers to check armstrong");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (find(i)) {
                System.out.print(i + " ");
            }
        }

    }

    static boolean find(int num) {
        int out = num;

        int i = String.valueOf(num).length();

        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, i);
            num /= 10;
        }

        return out == sum;
    }
}
