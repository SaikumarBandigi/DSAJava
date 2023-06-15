package Lectures.arraysandarraylist;

import java.util.Arrays;

public class ArrayInfo {
    public static void main(String[] args) {

        // declaration,instantiation and initialization
        int a[] = new int[10];

        for (int i = 0; i < a.length; i++) {
           a[i] = i;
       }

        for (int j : a) {
            System.out.println(j);
        }


    }
}
