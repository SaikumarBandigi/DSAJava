package assignments._1;

import java.util.Scanner;

public class _5_InputuntilpressX {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean flag = false;

        while (!flag) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                flag = true;
            } else {
                try {
                    int num = Integer.parseInt(input);
                    sum = sum + 1;
                } catch (Exception e) {
                    System.out.println("please enter only integer values");
                }

            }

        }
        System.out.println(sum);


    }
}
