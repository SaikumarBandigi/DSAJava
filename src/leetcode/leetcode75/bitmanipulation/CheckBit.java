package leetcode.leetcode75.bitmanipulation;

public class CheckBit {
    public static void main(String[] args) {
        int num=3;
        int bitPosition=2;
        System.out.println(isSetBit(num,bitPosition));
    }

    private static boolean isSetBit(int num, int bitPosition) {
        return ((num>>(bitPosition-1)) &1)==1;
    }
}
