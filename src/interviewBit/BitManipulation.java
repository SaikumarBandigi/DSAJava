package interviewBit;

public class BitManipulation {

    // 1. Check Odd / Even
    public static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

    // 2. Check ith Bit
    public static boolean isBitSet(int n, int i) {
        return (n & (1 << i)) != 0;
    }

    // 3. Set ith Bit
    public static int setBit(int n, int i) {
        return n | (1 << i);
    }

    // 4. Clear ith Bit
    public static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }

    // 5. Toggle ith Bit
    public static int toggleBit(int n, int i) {
        return n ^ (1 << i);
    }

    // 6. Remove Rightmost Set Bit
    public static int removeRightMostSetBit(int n) {
        return n & (n - 1);
    }

    // 7. Get Rightmost Set Bit
    public static int getRightMostSetBit(int n) {
        return n & (-n);
    }

    // 8. Check Power Of 2
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    // 9. Count Set Bits
    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            n = n & (n - 1);
            count++;
        }

        return count;
    }

    // 10. Find Unique Element
    public static int findUnique(int[] arr) {
        int xor = 0;

        for (int num : arr) {
            xor ^= num;
        }

        return xor;
    }

    public static void main(String[] args) {

        int n = 10; // 1010

        System.out.println("Odd ? " + isOdd(n));

        System.out.println("Bit 3 Set ? " + isBitSet(n, 3));

        System.out.println("Set Bit 0 = " + setBit(n, 0));

        System.out.println("Clear Bit 1 = " + clearBit(n, 1));

        System.out.println("Toggle Bit 1 = " + toggleBit(n, 1));

        System.out.println("Remove Rightmost Set Bit = " + removeRightMostSetBit(n));

        System.out.println("Rightmost Set Bit = " + getRightMostSetBit(n));

        System.out.println("Power Of Two ? " + isPowerOfTwo(16));

        System.out.println("Set Bits = " + countSetBits(13));

        int[] arr = {2, 3, 2, 4, 4};

        System.out.println("Unique Element = " + findUnique(arr));

    }
}