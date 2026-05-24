package interviewTut;

public class FindNumberOfDigitsInNumber {

    public static void main(String[] args) {

        int num = 123;
        System.out.println(new FindNumberOfDigitsInNumber().getNumberOfDigits(num));

    }

    int getNumberOfDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }

}
