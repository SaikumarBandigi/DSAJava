package fibotopic;

// 0 1 1 2 3 5 8 13 21 34 55
public class FibonacciNumber {
    public static void main(String[] args) {
        int number = 5;
        fibFind(number);
    }
    private static void fibFind(int number) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1 + " " + num2);

        for (int i = 2; i <= number; i++) {
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

}
