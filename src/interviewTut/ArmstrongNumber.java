package interviewTut;

public class ArmstrongNumber {

    public static void main(String[] args) {
        int num = 153;

        System.out.println(new ArmstrongNumber().isNumberArmstrong(num));

    }

    int countTheDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    boolean isNumberArmstrong(int num) {

        int original = num;
        int numberOfDigits = countTheDigits(num);

        double sum = 0;

        while (num != 0) {
            int digit = num % 10;
            double powRes = Math.pow(digit, numberOfDigits);
            sum += powRes;
            num /= 10;
        }
        return sum == original;
    }

}
