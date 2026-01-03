package leetcode.leetcode75.bitmanipulation;

public class MinimumFlipsToMakeAorBEqualToC {

    public static void main(String[] args) {
        int a1 = 2, b1 = 6, c1 = 5;
        int a2 = 4, b2 = 2, c2 = 7;
        int a3 = 1, b3 = 2, c3 = 3;

        System.out.println(minFlips(a1, b1, c1)); // Output: 3
        System.out.println(minFlips(a2, b2, c2)); // Output: 1
        System.out.println(minFlips(a3, b3, c3)); // Output: 0
    }

    public static int minFlips(int a, int b, int c) {
        int flips = 0;

        for (int i = 0; i < 32; i++) { // Iterate over all 32 bits
            int bitA = (a >> i) & 1; // Extract the i-th bit of a
            int bitB = (b >> i) & 1; // Extract the i-th bit of b
            int bitC = (c >> i) & 1; // Extract the i-th bit of c

            if (bitC == 1) {
                // If c_i = 1, both a_i and b_i must be 0
                if (bitA == 0 && bitB == 0) {
                    flips++;
                }
            } else {
                // If c_i = 0, at least one of a_i or b_i must be 1
                if (bitA == 1) {
                    flips++;
                }
                if (bitB == 1) {
                    flips++;
                }
            }
        }

        return flips;
    }
}
