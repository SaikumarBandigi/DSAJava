package assignments._3_conditional_loops;

import java.util.Arrays;

public class SumOfDigitsOfNum {
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
