package leetcodecontest.weekly.five06;

public class CheckGoodInteger {

    public static void main(String[] args) {
        int n = 19;
        System.out.println(new CheckGoodInteger().checkGoodInteger(n));
    }

    public boolean checkGoodInteger(int n) {

        int digitSum = digitSum(n);
        int squareSum = squareSum(n);

        return (squareSum-digitSum) >= n;
    }


    int digitSum(int n) {
        String s = String.valueOf(n);

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }

    private int squareSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            sum += digit * digit;
        }
        return sum;
    }

}
