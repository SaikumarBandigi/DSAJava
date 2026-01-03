package primepack;


public class PrimeFactorsForAGivenNumber {
    public static void main(String[] args) {

        int number = 5;
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }

    }
}
