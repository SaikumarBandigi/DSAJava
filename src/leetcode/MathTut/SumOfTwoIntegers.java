package leetcode.MathTut;

public class SumOfTwoIntegers {

    public static int add(int a, int b) {
        while (b != 0) {
            int sum = a ^ b;          // sum without carry
            int carry = (a & b) << 1; // carry

            a = sum;
            b = carry;
        }
        return a;
    }

    public static void main(String[] args) {
        int result = add(5, 3);
        System.out.println("Sum: " + result); // Output: 8
    }
}
