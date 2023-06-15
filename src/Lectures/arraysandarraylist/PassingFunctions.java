package Lectures.arraysandarraylist;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {


        int a[] = {101, 102, 103, 104, 105};

        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));

    }

    static void change(int a[]) {
        a[0] = 50;
    }
}
