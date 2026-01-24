package leetcode.bitmanipulationtut;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(countBits(5)));
    }

    static int[] countBitsOptimized(int num) {
        int[] arr = new int[num + 1];

        for (int i = 1; i <= num; i++) {
            arr[i] = arr[i >> 1] + (i & 1);
        }

        return arr;
    }

    static int[] countBits(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;

        for (int i = 1; i <= num; i++) {
            arr[i] = CountSetBitsOfAParticularNumber(i);
        }

        return arr;
    }

    static int CountSetBitsOfAParticularNumber(int num) {

        int counter = 0;

        for (int bitPosition = 1; bitPosition <= 32; bitPosition++) {
            if (isSetBit(num, bitPosition)) {
                counter++;
            }
        }
        return counter;
    }

    static boolean isSetBit(int num, int bitPosition) {
        return ((num >> (bitPosition - 1)) & 1) == 1;
    }

}
