package leetcode.NumberTheoryTut;

import java.util.*;

public class PrimePairsWithTargetSum {

    public static void main(String[] args) {
        int n = 10;

        System.out.println(new PrimePairsWithTargetSum().findPrimePairsTLE(n));
        System.out.println(new PrimePairsWithTargetSum().findPrimePairsOptimized(n));

    }

    public List<List<Integer>> findPrimePairsTLE(int n) {

        List<List<Integer>> lists = new ArrayList<>();

        int[] primes = new int[n];
        int idx = 0;

        // generate primes
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                primes[idx++] = i;
            }
        }

        int target = n;

        // find pairs
        for (int i = 0; i < idx; i++) {
            for (int j = i; j < idx; j++) {
                if (primes[i] + primes[j] == target) {
                    lists.add(Arrays.asList(primes[i], primes[j]));
                }
            }
        }

        // sort result
        lists.sort(new CustomComparator());

        return lists;
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        int limit = (int) Math.sqrt(num);

        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    private List<List<Integer>> findPrimePairsOptimized(int n) {
        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sieve
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Step 2: Collect primes
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                primes.add(i);
        }

        // Step 3: Two pointer
        int left = 0;
        int right = primes.size() - 1;

        while (left <= right) {
            int sum = primes.get(left) + primes.get(right);

            if (sum == n) {
                result.add(Arrays.asList(primes.get(left), primes.get(right)));
                left++;
                right--;
            } else if (sum < n) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

}

class CustomComparator implements Comparator<List<Integer>> {

    @Override
    public int compare(List<Integer> o1, List<Integer> o2) {
        return o1.get(0) - o2.get(0);
    }

}