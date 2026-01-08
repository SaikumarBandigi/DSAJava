package leetcode.NumberTheoryTut;

// >=number
/*
2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
31, 37, 41, 43, 47, 53, 59, 61, 67, 71,
73, 79, 83, 89, 97, 101, 103, 107, 109, 113
 */
public class PrimePalindrome {
    public static int primePalindrome(int n) {

        // handle small cases
        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;

        if (n <= 11) return 11;

        // generate only odd-length palindromes
        for (int i = 1; i < 100000; i++) {
            int palindrome = createPalindrome(i);
            if (palindrome >= n && isPrime(palindrome)) {
                return palindrome;
            }
        }
        return -1;
    }

    // creates odd-length palindrome
    static int createPalindrome(int x) {
        int res = x;
        x /= 10;
        while (x > 0) {
            res = res * 10 + (x % 10);
            x /= 10;
        }
        return res;
    }

    static boolean isPrime(int num) {
        if (num < 2)
            return false;
        if (num % 2 == 0)
            return num == 2;

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 180;
        System.out.println(primePalindrome(n));
    }

}
