package jav;

public class PreciseFormat {
    public static void main(String[] args) {
        printInFormat(5.43f, 2.653f);
    }

    static void printInFormat(float a, float b) {
        float result = a / b;
        System.out.print(result + " " + String.format("%.3f", result));
    }

}
