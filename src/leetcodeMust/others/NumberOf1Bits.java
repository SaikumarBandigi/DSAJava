package leetcodeMust.others;

public class NumberOf1Bits {
    static void main() {

        int n = 128; // 1011
        System.out.println(hammingWeight(n)); // 3

    }

    public static int hammingWeight(int n) {

        String binaryString = Integer.toBinaryString(n);
        return getNumberOf1s(binaryString);
    }

    static int getNumberOf1s(String s) {
        int res = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                res += 1;
            }
        }
        return res;
    }
}
