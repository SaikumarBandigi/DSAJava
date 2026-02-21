package leetcodecontest.weekly.Four81;

public class MirrorDistanceOfAnInteger {
    public static void main(String[] args) {
        int n = 25;
        System.out.println(mirrorDistance(n));
    }

    public static int mirrorDistance(int n) {
        int rev = reverse(n);
        return Math.abs(n - rev);
    }

    static int reverse(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        return rev;
    }

}
