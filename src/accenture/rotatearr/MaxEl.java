package accenture.rotatearr;

import java.util.Arrays;

public class MaxEl {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 9, 3, 5, 8};

        if (array.length < 3) {
            System.out.println("Array has less than three elements. Unable to find the third largest element.");
            return;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax) {
                thirdMax = num;
            }
        }

        System.out.println("The third largest element is: " + thirdMax);
    }
}
