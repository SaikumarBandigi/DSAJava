package accenture.rotatearr;

import java.util.Arrays;

public class SubArrayExample {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int startIndex = 2;
        int endIndex = 7;

        int newArraySize = endIndex - startIndex;
        int[] newArray = new int[newArraySize];

        for (int i = 0; i < newArraySize; i++) {
            newArray[i] = a[startIndex + i];
        }

        //  System.out.println(Arrays.toString(a));
        System.out.println(arrayToString(newArray));

    }

    private static String arrayToString(int[] a) {

        StringBuilder s = new StringBuilder("[");

        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(",");
            }
        }
        s.append("]");
        return s.toString();
    }
}
