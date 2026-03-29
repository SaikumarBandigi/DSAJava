package leetcode.MathTut;

public class PalindromeNumber {
    public static void main(String[] args) {

        int x = -121;
        System.out.println(new PalindromeNumber().isPalindrome(x));

    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        return isPali(x);
    }

    boolean isPali(int num) {
        int temp = num;
        int res = 0;
        while (num != 0) {
            int digit = num % 10;
            res = res * 10 + digit;
            num /= 10;
        }
        return res == temp;
    }

}

