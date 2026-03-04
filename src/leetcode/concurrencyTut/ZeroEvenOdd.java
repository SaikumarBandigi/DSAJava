package leetcode.concurrencyTut;

import java.util.function.IntConsumer;


class ZeroEvenOdd {

    int n;
    int current = 1;
    int state = 0;

    public ZeroEvenOdd(int n) {
        this.n = n;
    }


    public synchronized void zero(IntConsumer printNumber) throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            while (state != 0) {
                wait();
            }
            printNumber.accept(0);

            if (i % n == 1) {
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
                if (current > n) return;
                wait();
            }
            if (current > n) return;
            printNumber.accept(1);
            current++;
            state = 0;
            notifyAll();
        }
    }

    public synchronized void even(IntConsumer printNumber) throws InterruptedException {
        while (true) {
            while (state != 2) {
                if (current > n) return;
                wait();
            }
            if (current > n) return;
            printNumber.accept(2);
            current++;
            state = 0;
            notifyAll();
        }
    }


    public static void main(String[] args) {

        ZeroEvenOdd obj = new ZeroEvenOdd(2);

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
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                obj.odd(printNumber);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                obj.even(printNumber);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        t1.start();
        t2.start();
        t3.start();

    }

}
