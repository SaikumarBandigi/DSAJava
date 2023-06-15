package assignments._4_functions;

public class PrimeNumber {
    public static void main(String[] args) {

        int num = 7;
        int c = 2;
        boolean flag = false;

        while (!flag) {

            while (c < num) {
                if (num % c == 0) {
                    System.out.println("not prime");
                    flag = true;
                    break;
                } else {
                    c = c + 1;
                }
            }
            break;
        }

        if (!flag) {
            System.out.println("prime");
        }
    }
}
