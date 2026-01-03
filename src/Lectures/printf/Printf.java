package Lectures.printf;

public class Printf {
    public static void main(String[] args) {
//        int[][] a = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//
//        for (int[] aa : a) {
//            for (int s : aa) {
//                System.out.print(s + " ");
//            }
//            System.out.println();
//        }

        String name = "Sonu";
        int age = 24;
        float height = 1.70f;

        System.out.printf("Name:%s,Age:%d,Height:%.2f", name, age, height);
        /*
  In this example, the format string contains placeholders that start with % and are followed by a character representing the type
 of the value to be formatted. Here's a breakdown of the placeholders used:

%s is a placeholder for a string value (name).
%d is a placeholder for an integer value (age).
%.2f is a placeholder for a floating-point value (height) with two decimal places.
The corresponding arguments (name, age, height) are provided after the format string in the same order.

You can use various format specifiers to control the appearance of the output, including specifying the width, precision, and alignment.
 Refer to the Java documentation on Formatter for more information on different formatting options.
         */

    }
}
