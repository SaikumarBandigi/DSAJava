package assignments._2;

// 0 1 1 2 3 5 8 13 21 34

public class Fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b);

        int num = 9;

        int i = 2;
        while (i <= num) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            i++;
        }


    }
}
