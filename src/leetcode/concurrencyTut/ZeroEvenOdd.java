package leetcode.concurrencyTut;

import java.util.function.IntConsumer;


class ZeroEvenOdd {
    private final int n;
    private int current = 1;
    private int state = 0;  // 1
    // 0 -> zero
    // 1 -> odd
    // 2 -> even

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            while (state != 0) {
                wait();
            }

            printNumber.accept(0);

            if (i % 2 == 1) {
                state = 1;
            } else {
                state = 2;
            }

            notifyAll();
        }
    }

    public synchronized void odd(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            while (state != 1) {
                if (current > n)
                    return;
                wait();
            }

            if (current > n)
                return;

            printNumber.accept(current);
            current++;
            state = 0;
            notifyAll();
        }

    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            while (state != 2) {
                if (current > n)
                    return;
                wait();
            }

            if (current > n)
                return;

            printNumber.accept(current);
            current++;
            state = 0;
            notifyAll();
        }

    }


    public static void main(String[] args) {
        int n = 1;// Change value to test

        ZeroEvenOdd obj = new ZeroEvenOdd(n);

        IntConsumer printNumber = new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.print(value);
            }
        };

        Thread t1 = new Thread(() -> {
            try {
                obj.zero(printNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                obj.odd(printNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                obj.even(printNumber);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t3.start();
    }

}