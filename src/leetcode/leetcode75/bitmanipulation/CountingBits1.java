package leetcode.leetcode75.bitmanipulation;

import java.util.Arrays;

public class CountingBits1 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(Arrays.toString(checkBits(num)));
    }

    private static int[] checkBits(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;

        for (int i = 1; i <= num; i++) {
            arr[i] = checkSetBit(i);
        }
        return arr;
    }

    private static int checkSetBit(int num) {
        int counter = 0;
        for (int bitPosition = 1; bitPosition <= 32; bitPosition++) {
            if (isSetBit(num, bitPosition)) {
                counter += 1;
            }
        }
        return counter;
    }

    private static boolean isSetBit(int num, int bitPosition) {
        return ((num >> (bitPosition - 1)) & 1) == 1;
    }

}
