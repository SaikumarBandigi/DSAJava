package javacontrolflow;

public class Example {
    public static void main(String[] args) {
        evenOdd(5, 4);
    }

    static void evenOdd(int a, int b) {
        System.out.println((checkEven(a) ? a : b));
        System.out.println((checkOdd(a) ? a : b));
    }

    static boolean checkEven(int n) {
        return (n % 2 == 0);
    }

    static boolean checkOdd(int n) {
        return (n % 2 != 0);
    }


}
