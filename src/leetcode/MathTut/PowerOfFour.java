package leetcode.MathTut;

public class PowerOfFour {

    public static void main(String[] args) {
        int n = 16;

        System.out.println(new PowerOfFour().isPowerOfFour(n));

    }

    public boolean isPowerOfFour(int n) {

        if (n <= 0) return false;

        while (n % 4 == 0) {
            n /= 4;
        }

        return n == 1;
    }

}
