package leetcode.stackConcept;

public class Example {
    public static void main(String[] args) {
        System.out.println(findLCM(12, 18));
    }

    private static int findLCM(int num1, int num2) {
        return (num1 * num2) / GCD(num1, num2);
    }

    private static int GCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }


}
