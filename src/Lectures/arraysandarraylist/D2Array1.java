package Lectures.arraysandarraylist;

import java.util.Arrays;

public class D2Array1 {

    public static void main(String[] args) {


        int a[][] = new int[2][2];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = i + j;
            }
        }


    }
}
