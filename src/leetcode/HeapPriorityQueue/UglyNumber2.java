package leetcode.HeapPriorityQueue;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class UglyNumber2 {
    public static void main(String[] args) {

        int n = 10;
        System.out.println(new UglyNumber2().nthUglyNumber(n));
        System.out.println(new UglyNumber2().nthUglyNumberUsingHeap(n));
    }

    public int nthUglyNumber(int n) {

        int count = 0;
        int i = 1;

        while (true) {

            if (isUglyTLE(i)) {
                count++;

                if (count == n) {
                    return i;
                }
            }

            i++;
        }
    }

    public boolean isUglyTLE(int n) {

        if (n <= 0) {
            return false;
        }

        int[] primes = {2, 3, 5};

        for (int p : primes) {
            while (n % p == 0) {
                n = n / p;
            }
        }

        return n == 1;
    }

    public int nthUglyNumberUsingHeap(int n) {

        PriorityQueue<Long> pq = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();

        pq.add(1L);
        set.add(1L);

        long num = 1;

        for (int i = 0; i < n; i++) {

            num = pq.poll();

            long a = num * 2;
            long b = num * 3;
            long c = num * 5;

            if (!set.contains(a)) {
                pq.add(a);
                set.add(a);
            }

            if (!set.contains(b)) {
                pq.add(b);
                set.add(b);
            }

            if (!set.contains(c)) {
                pq.add(c);
                set.add(c);
            }
        }

        return (int) num;
    }


}
