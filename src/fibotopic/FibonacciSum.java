package fibotopic;

public class FibonacciSum {
    public static void main(String[] args) {

    }
}

// User function Template for Java
class Solution {
    static long fibSum(long N) {
        int mod=1000000007;
        long a=0;
        long b=1;
        long fib=0;
        long sum=1;
        for(int i=2;i<=N;i++)
        {
            fib=(a+b)%mod;
            sum+=fib;
            a=b;
            b=fib;
        }
        return sum%mod;
    }
}