package leetcode.bitmanipulationtut;

public class BitwiseANDOfNumbersRange {
    public static void main(String[] args) {
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
