package Lectures.arraysandarraylist;

import java.util.Arrays;

public class ColNotFixed {
    public static void main(String[] args) {

        int a[][] = new int[2][];

        a[0] = new int[3];
        a[1] = new int[1];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i + j;
            }
        }


        for (int[] arr : a) {
            System.out.println(Arrays.toString(arr));
        }


    }
}
