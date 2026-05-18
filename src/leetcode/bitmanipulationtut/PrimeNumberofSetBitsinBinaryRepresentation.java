package leetcode.bitmanipulationtut;

public class PrimeNumberofSetBitsinBinaryRepresentation {

    public static void main(String[] args) {

        int left = 6, right = 10;
        System.out.println(new PrimeNumberofSetBitsinBinaryRepresentation().countPrimeSetBits(left, right));

    }

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        // 6        10
        for (int i = left; i <= right; i++) {
            int primeNumberOfSetBits = 0;
            for (int j = 0; j < 32; j++) {
                if (isBitSet(i, j)) {
                    primeNumberOfSetBits++;
                }
            }
            if (isPrime(primeNumberOfSetBits)) {
                count++;
            }
        }
        return count;
    }

    boolean isBitSet(int num, int pos) {
        return ((num >> pos) & 1) == 1;
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }


}
