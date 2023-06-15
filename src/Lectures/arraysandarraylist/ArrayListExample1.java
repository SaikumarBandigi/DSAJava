package Lectures.arraysandarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> values = new ArrayList<>();


//        for (int i = 0; i < 5; i++) {
//            values.add(sc.nextInt());
//        }


// or //

//        int a = 0;
//        while (a < 5) {
//            values.add(sc.nextInt());
//            a++;
//        }

        for (int i = 0; i < 5; i++) {
            System.out.println(values.get(i));
        }


    }
}
