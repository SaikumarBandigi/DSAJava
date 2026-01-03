package bitwise;

public class NumberOf1Bits {
    public static void main(String[] args) {

        String input = "011";
    }

    public int hammingWeight(int n) {
        int count = 0;

        // Iterate over all bits
        for (int i = 0; i < 32; i++) {
            // Check if the current bit is set
            if ((n & (1 << i)) != 0) {
                count++;
            }
        }

        return count;
    }
}
