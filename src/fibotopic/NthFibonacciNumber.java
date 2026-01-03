package fibotopic;

// 0 1 1 2 3 5 8 13 21 34 55
public class NthFibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fiboFind(5));
    }
    private static int fiboFind(int n) {
        int MOD = 1000000007;
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = (a + b) % MOD;
            a = b;
            b = temp;
        }
        return b;
    }
}
