package leetcode.bitmanipulationtut;

public class BitManipulationMain {
    // 1️⃣ XOR
    public static int xor(int a, int b) {
        return a ^ b;
    }

    // 2️⃣ Set a bit at position pos (0-based)
    public static int setBit(int num, int pos) {
        return num | (1 << pos);
    }

    // 3️⃣ Clear a bit at position pos
    public static int clearBit(int num, int pos) {
        return num & ~(1 << pos);
    }

    // 4️⃣ Toggle a bit at position pos
    public static int toggleBit(int num, int pos) {
        return num ^ (1 << pos);
    }

    // 5️⃣ Check if a bit is set
    public static boolean isBitSet(int num, int pos) {
        return (num & (1 << pos)) != 0;
    }

    // 6️⃣ Remove rightmost set bit
    public static int removeRightMostSetBit(int num) {
        return num & (num - 1);
    }

    // 7️⃣ Count number of set bits
    public static int countSetBits(int num) {
        int count = 0;
        while (num != 0) {
            num = num & (num - 1);
            count++;
        }
        return count;
    }

    // 8️⃣ Check if number is power of 2
    public static boolean isPowerOfTwo(int num) {
        if (num <= 0) return false;
        return (num & (num - 1)) == 0;
    }

    // Main method to test all functions
    public static void main(String[] args) {

        int a = 5;  // 0101
        int b = 3;  // 0011

        System.out.println("XOR: " + xor(a, b));

        System.out.println("Set bit 1 of 5: " + setBit(5, 1));

        System.out.println("Clear bit 1 of 7: " + clearBit(7, 1));

        System.out.println("Toggle bit 1 of 5: " + toggleBit(5, 1));

        System.out.println("Is bit 2 set in 5: " + isBitSet(5, 2));

        System.out.println("Remove rightmost set bit of 12: " + removeRightMostSetBit(12));

        System.out.println("Count set bits in 13: " + countSetBits(13));

        System.out.println("Is 16 power of 2: " + isPowerOfTwo(16));
    }
}
