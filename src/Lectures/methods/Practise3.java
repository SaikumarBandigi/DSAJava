package Lectures.methods;

public class Practise3 {
    public static void main(String[] args) {

//        int num = 153;
//
//        boolean b = isArmstrong(num);
//        System.out.println(b);


        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }

    private static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;


        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum + (rem * rem * rem);
        }
        return original == sum;
    }
}
