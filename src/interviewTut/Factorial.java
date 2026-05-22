package interviewTut;

public class Factorial {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(new Factorial().factorial(num));
    }

    int factorial(int n) {
        if (n <= 1) return 1;

        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

}
