package leetcode.bitmanipulationtut;

public class CountingBits {
    public static void main(String[] args) {

        System.out.println(isSetBit(2, 1));
    }

    private static boolean isSetBit(int num, int bitPosition) {
        return ((num >> (bitPosition - 1)) & 1) == 1;
    }
}
