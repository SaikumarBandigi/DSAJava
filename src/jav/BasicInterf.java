package jav;

import java.util.ArrayList;

public class BasicInterf {
    public static void main(String[] args) {
        new TestClass1().display(19);
    }
}

class TestClass1 implements in1 {
    public void display(int k) {
        int count = 0;
        for (int i = 2; i <= k; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    boolean isPrime(int N) {
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

interface in1 {
    void display(int k);
}
