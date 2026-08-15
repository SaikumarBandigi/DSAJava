package practisetut;

import java.util.Arrays;


public class Example {

    public static void main(String[] args) {

        int[] prices = {10, 30, 21};
        int[] discounts = {50, 60};
        System.out.println(new Example().minPrice(prices, discounts));
    }

    public double minPrice(int[] prices, int[] discounts) {

        Arrays.sort(prices);
        Arrays.sort(discounts);

        double minimumPossibleSum = 0;

        for (int p : prices) {
            minimumPossibleSum += p;
        }

        int n = prices.length;
        int m = discounts.length;
        int k = Math.min(n, m);

        for (int i = 0; i < k; i++) {
            int p = prices[n - 1 - i];
            int d = discounts[m - 1 - i];

            minimumPossibleSum -= discountAmount(p, d);
        }

        return minimumPossibleSum;
    }

    double discountAmount(int p, int d) {
        return (p * d) / 100.0;
    }


}
