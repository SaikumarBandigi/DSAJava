package bitwise;

import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int num = 2;
        int[] res = countBits(num);
        System.out.println(Arrays.toString(res));
    }

    public static int[] countBits(int num) {

        int[] res = new int[num + 1];

        for (int i = 0; i <= num; i++) {
            res[i] = countSetBits(i);
        }
        return res;

    }

    private static int countSetBits(int num) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (checkBit(num, i)) {
                count++;
            }
        }
        return count;
    }


    private static boolean checkBit(int num, int pos) {
        int bitmask = 1 << pos;
        return (num & bitmask) != 0;
    }

}
