package leetcode.bitmanipulationtut;

public class isPowerOf2 {
    public static void main(String[] args) {

        int from = 0;
        int to = 10;

        while (from <= to) {
            if (isPowerOfTwo(from)) {
                System.out.println(from + " is Power of 2");
            } else {
                System.out.println(from + " is not a Power of 2");
            }
            from++;
        }

    }

    static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }

}
