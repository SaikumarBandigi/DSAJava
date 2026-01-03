package Lectures.recursion;

public class Main {
    public static void main(String[] args) {
        print(1);
    }

    private static void print(int n) {
        System.out.println(n);
        print1(n + 1);
    }

    private static void print1(int n) {
        System.out.println(n);
        print2(n + 1);
    }

    private static void print2(int n) {
        System.out.println(n);
    }
}
