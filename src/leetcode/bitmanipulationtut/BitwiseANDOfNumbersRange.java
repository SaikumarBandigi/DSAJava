package leetcode.bitmanipulationtut;

public class BitwiseANDOfNumbersRange {
    public static void main(String[] args) {
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
