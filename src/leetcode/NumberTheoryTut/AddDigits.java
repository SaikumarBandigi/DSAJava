package leetcode.NumberTheoryTut;

public class AddDigits {
    public static void main(String[] args) {
        int num = 385;
        System.out.println(addDigits(num));

    }

    static public int addDigits(int num) {

        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        return num;
    }

}
