package biginttut;

import java.math.BigInteger;

public class Practise1 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("11111111");
        BigInteger b = new BigInteger("11111111");

        // Addition
        BigInteger sum = a.add(b);
        System.out.println("Sum: " + sum);

        // Subtraction
        BigInteger difference = a.subtract(b);
        System.out.println("Difference: " + difference);

        // Multiplication
        BigInteger product = a.multiply(b);
        System.out.println("Product: " + product);

        // Division
        BigInteger quotient = a.divide(b);
        System.out.println("Quotient: " + quotient);

        // Modulus
        BigInteger remainder = a.remainder(b);
        System.out.println("Remainder: " + remainder);

        // Power
        BigInteger power = a.pow(2);
        System.out.println("Power: " + power);

        // Comparison
        int comparison = a.compareTo(b);
        System.out.println("Comparison: " + (comparison < 0 ? "a is less than b" : (comparison > 0 ? "a is greater than b" : "a is equal to b")));
    }
}
