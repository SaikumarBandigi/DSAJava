package primepack;

import java.util.ArrayList;

public class FindPrimeNumbersInARange {
    public static void main(String[] args) {
        int M = 0;
        int N = 101;
        ArrayList<Integer> arrayList = listOutPrime(M, N);
        System.out.println((arrayList));
    }

    private static ArrayList<Integer> listOutPrime(int M, int N) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (; M <= N; M++) {
            if (isPrime(M)) {
                arrayList.add(M);
            }
        }
        return arrayList;
    }

    static boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }



}
