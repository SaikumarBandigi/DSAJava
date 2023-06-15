package assignments._2;

import java.util.Scanner;

public class IndianRupeeToUSD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();

        float usd = (input * (0.01213f));
        System.out.println(usd);

    }
}
