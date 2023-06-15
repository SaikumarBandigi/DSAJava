package Lectures.methods;

public class ArmStrongNumber {
    public static void main(String[] args) {

        int n = 153;
//        boolean b = isArmStrong(n);
//        System.out.println(b);


        System.out.println(1%10);

    }

    private static boolean isArmStrong(int n) {

        int original = n;
        int sum = 0;


        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + (rem * rem * rem);

        }
        return original == sum;
    }

//    private static boolean isArmStrong(int n) {
//
//        int original = n;
//        int sum = 0;
//
//        while (n > 0) {
//            int rem = n % 10;
//            n = n / 10;
//            sum = sum + (rem * rem * rem);
//        }
//
//        return sum == original;
//    }
}
