package leetcode.NumberTheoryTut;

public class GCDOfODD_EvenSums {
    public static void main(String[] args) {
        System.out.println(gcdOfOddEvenSums(4));
    }

    public static int gcdOfOddEvenSums(int n) {

        int res = GCD(n * n, (n * n) + n);
        return res;
    }

    static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
