package accenture;

public class MetaNumber {
    public static void main(String[] args) {

        int a = 1;
        int N = 100;

        int res = MetaNumb(a, N);
        System.out.println(res);

    }

    private static int MetaNumb(int a, int N) {

        int res = 0;
        for (int i = a; i <= N; i++) {
            if (i % 8 == 0 && i % 10 != 0) {
                res++;
            }
        }
        return res;
    }
}
