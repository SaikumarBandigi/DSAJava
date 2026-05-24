package interviewTut;

public class FindSumOfAllDigitsInANumber {

    public static void main(String[] args) {

        int num = 123;
        System.out.println(new FindSumOfAllDigitsInANumber().getSumOfAllDigits(num));

    }

    int getSumOfAllDigits(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;
    }

}
