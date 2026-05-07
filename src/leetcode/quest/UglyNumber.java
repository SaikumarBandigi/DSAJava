package leetcode.quest;

public class UglyNumber {

    public static void main(String[] args) {

        int n = 16;
        System.out.println(new UglyNumber().isUgly(n));

    }

    public boolean isUgly(int n) {
        if (n <= 0) return false;

        int[] factors = {2, 3, 5};

        for (int f : factors) {
            while (n % f == 0) {
                n /= f;
            }
        }
        return n == 1;
    }

}
