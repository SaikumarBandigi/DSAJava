package Lectures.methods;

import java.util.Arrays;

/*
variable length arguments
length is not constant, varies according to the input.

we can give multiple data type with varArgs but that should be declared at last in method arguments.

 */

public class VarArgs {
    public static void main(String[] args) {

        show(1, 2, 3, 4, 5, 6, 7, 8, 9);
        disc(20,30,"sai","kumar");

    }

    private static void show(int ...v) {
        System.out.println(Arrays.toString(v));

        int[] a = {1, 2, 3,};


    }

    private static void disc(int a,int b,String ...s)
    {
        System.out.println(Arrays.toString(s));
    }
}
