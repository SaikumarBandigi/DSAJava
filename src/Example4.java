public class Example4 {
    public static void main(String[] args) {

        int num = 3;
        boolean res = checkPrime(num);
        System.out.println(res);
    }

    private static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;

            }
        }
        return true;
    }

}
