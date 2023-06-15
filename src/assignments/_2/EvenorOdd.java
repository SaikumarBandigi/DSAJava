package assignments._2;

import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        if (num % 2 == 0)
//            System.out.println("even");
//        else System.out.println("odd");


        String result = (num % 2 == 0) ? "Even" : "ODD";

        System.out.println(result);
    }
}
