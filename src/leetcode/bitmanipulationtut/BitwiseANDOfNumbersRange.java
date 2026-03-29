package leetcode.bitmanipulationtut;

public class BitwiseANDOfNumbersRange {
    public static void main(String[] args) {
<<<<<<< HEAD
        int left = 1;
        int right = 2147483647;
        System.out.println(new BitwiseANDOfNumbersRange().rangeBitwiseAnd(left, right));
    }

    public int rangeBitwiseAnd(int left, int right) {// 5 7
        return -1;

    }
}
/*
Range [5,7]

Binary values:

5 = 101
6 = 110

AND operation:

101
110
---
100 = 4

Output:
4

 */
=======
        int left = 5;
        int right = 8;
        //  System.out.println(new BitwiseANDOfNumbersRange().rangeBitwiseAndTLE(left, right));
        System.out.println(new BitwiseANDOfNumbersRange().rangeBitwiseAndUsingRemovingRightMostSetBit(left, right));
    }

    public int rangeBitwiseAndTLE(int left, int right) {
        int res = left;
        for (int i = left + 1; i <= right; i++) {
            res = bitwiseAND(res, i);
        }
        return res;
    }

    public int rangeBitwiseAndUsingRemovingRightMostSetBit(int left, int right) {
        while (right > left) {
            right = right & (right - 1);
        }
        return right;
    }

    int bitwiseAND(int a, int b) {
        return (a & b);
    }

}
>>>>>>> 5e9f64d2a708e126719c77d7538bcf3417a88d07
