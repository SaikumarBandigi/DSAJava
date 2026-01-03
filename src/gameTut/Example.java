package gameTut;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int firstRange = sc.nextInt();
        int secondRange = sc.nextInt();

        findEven(firstRange, secondRange);

        sc.close();
    }

    private static void findEven(int firstRange, int secondRange) {

        for (int i = firstRange; i <= secondRange; i++) {
            if (isEven(i)) {
                System.out.println(i);
            }
        }

    }

    static boolean isEven(int number) {
        return (number & 1) == 0;
    }


}
