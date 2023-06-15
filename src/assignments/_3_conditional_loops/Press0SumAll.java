package assignments._3_conditional_loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Press0SumAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList();

        while (true) {
            int num = sc.nextInt();
            list.add(num);
            if (num == 0) {
                break;
            }
        }
        int largest = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            int currentnumber = list.get(i);
            if (currentnumber > largest) {
                largest = currentnumber;
            }
        }
        System.out.println(largest);
    }
}
