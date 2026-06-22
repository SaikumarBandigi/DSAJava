package neetcode.blind75;

import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.toString(new CountingBits().countBits(n)));
        System.out.println(Arrays.toString(new CountingBits().countBitsOptimal(n)));
    }

    public int[] countBits(int n) {
        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            arr[i] = getNumberOfBitsInASingleNumber(i);
        }
        return arr;
    }

    int getNumberOfBitsInASingleNumber(int num) {
        String binaryString = Integer.toBinaryString(num);

        int count = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    public int[] countBitsOptimal(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = countSetBitsOptimal(i);
        }

        return ans;
    }


    private int countSetBitsOptimal(int num) {
        int count = 0;

        while (num != 0) {
            num = num & (num - 1);
            count++;
        }

        return count;
    }

}
