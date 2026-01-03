package leetcode.leetcode75.bitmanipulation;

import java.util.Arrays;

public class Practise {
    public static void main(String[] args) {
        int num = 2;
        System.out.println(Arrays.toString(checkBits(num)));
    }

    private static int[] checkBits(int num) {
        int[] array = new int[num + 1];
        array[0] = 0;

        for (int i = 1; i <= num; i++) {
            array[i] = checkSetBit(num);
        }
        return array;
    }

    private static int checkSetBit(int num) {
        int counter = 0;
        for (int bitPosition = 1; bitPosition < 32; bitPosition++) {
            if (isSetBit(num, bitPosition)) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean isSetBit(int num, int bitPosition) {
        return (num >> (bitPosition - 1) & 1) == 1;
    }

}
