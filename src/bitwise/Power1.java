package bitwise;

public class Power1 {
    public static void main(String[] args) {
        int a = 2; // Change the base value as needed
        int b = 3; // Change the exponent value as needed

        long result = calculatePower(a, b);
        System.out.println(result);
    }

    public static long calculatePower(int a, int b) {
        if (b == 0) {
            return 1;
        }

        long temp = calculatePower(a, b / 2);
        long result = temp * temp;

        // If b is odd, multiply by a once more
        if (b % 2 == 1) {
            result *= a;
        }

        return result;

    }
}
