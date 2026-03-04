package leetcode.concurrencyTut;

class Foo {

    private int state = 0;
    // 0 -> first
    // 1 -> second
    // 2 -> third

    public Foo() {
    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {
        if (state == 0) {
            printFirst.run();
        }
        state = 1;
        notifyAll();
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while (state < 1) {
            wait();
        }
        printSecond.run();
        state = 2;
        notifyAll();
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while (state < 2) {
            wait();
        }
        printThird.run();
    }
}

public class PrintInOrder {
    public static void main(String[] args) {

        Foo obj = new Foo();

        Runnable first = () -> System.out.println("first");
        Runnable second = () -> System.out.println("second");
        Runnable third = () -> System.out.println("third");

        Thread t1 = new Thread(() -> {
            try {
                obj.first(first);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                obj.second(second);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t3 = new Thread(() -> {
            try {
                obj.third(third);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 🔥 Example 2: nums = [3,1,2]
        t3.start();
        t1.start();
        t2.start();

    }
}