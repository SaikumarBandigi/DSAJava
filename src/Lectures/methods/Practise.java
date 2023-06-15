package Lectures.methods;


public class Practise {
    public static void main(String[] args) {

        int num = 5;
       // boolean b = isPrime(5);
//
//        if (isPrime(num) == true)
//            System.out.println("not prime");
//        else
//            System.out.println("prime");

        for(int i=2;i<100;i++)
        {
            if (isPrime(i))
                System.out.print(i+" ");
        }
    }

    static boolean isPrime(int num) {
        int c = 2;
        boolean flag = true;

        while (flag) {
            while (c < num) {
                if (num % c == 0) {
                    flag = false;
                    break;
                }
                c++;
            }
            break;
        }
        return flag;
    }
}
