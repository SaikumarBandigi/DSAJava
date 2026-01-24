package leetcode.bitmanipulationtut;

public class isPowerOf2 {
    public static void main(String[] args) {

//        int from = 0;
//        int to = 10;
//
//        while (from <= to) {
//            if (isPowerOfTwo(from)) {
//                System.out.println(from + " is Power of 2");
//            } else {
//                System.out.println(from + " is not a Power of 2");
//            }
//            from++;
//        }

/*
For any power of two in binary:

1 → 0001
2 → 0010
4 → 0100
8 → 1000

Only one bit is set.

n & (n - 1) removes the lowest set bit.
So for power of two → result becomes 0.


 */
        System.out.println(isPowerOfTwo(8));


    }

    static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

}
