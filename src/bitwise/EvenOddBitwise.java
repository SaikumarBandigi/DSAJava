

public class EvenOddBitwise {
    public static void main(String[] args) {

        int n = 10;

        String result = (n & 1) == 0 ? "even" : "odd";

        System.out.println(n + " is " + result);
    }
}
