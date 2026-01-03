package mathTut;

public class SumOfSquaresFirstNNaturalNumbers {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(getSumOfSquaresFirstNNaturalNumbers(n));
    }

    static int getSumOfSquaresFirstNNaturalNumbers(int n) {
        int formula = n * (n + 1) * (2 * n + 1) / 6;
        return formula;
    }

}
