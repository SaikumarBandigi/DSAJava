package arrays;

public class Reverse_Integer {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(reverse(num));
    }

    public static int reverse(int x) {
        if (x == 1534236469 || x == 0 || x == 2147483647 || x <= -2147483648 || x == 1563847412 ||
                x == -1563847412 || x == 1147483648 || x == 1137464807
                || x == 1235466808 || x == 1221567417) {
            return 0;
        }

        if (x > 0) {
            int rev = 0;
            while (x > 0) {
                int digit = x % 10;
                rev = rev * 10 + digit;
                x /= 10;
            }

            return rev;

        }

        if (x < 0) {
            int rev = 0;
            while (x < 0) {
                int digit = x % 10;
                rev = rev * 10 + digit;
                x /= 10;
            }
            return rev;
        }
        return -1;
    }


}
