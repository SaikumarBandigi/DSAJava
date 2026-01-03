package mathTut;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(getSumOfFirstNNaturalNumbers(n));
    }

    private static int getSumOfFirstNNaturalNumbers(int n) {
        int formula = n * (n + 1) / 2;
        return formula;
    }

}
