package leetcode.NumberTheoryTut;

public class Example {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(addAllDIGITS(num));
        System.out.println(reverseANumber(num));
    }

    static int addAllDIGITS(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    static int reverseANumber(int num) {
        int rev = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num /= 10;
        }
        return rev;
    }

}
