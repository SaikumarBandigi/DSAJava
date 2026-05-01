package practisetut;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.println(new ArmstrongNumber().isArmstrong(153));
    }

    boolean isArmstrong(int n) {
        int original = n;
        int count = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += (int) Math.pow(digit, count);
            n /= 10;
        }
        return original == sum;
    }
}