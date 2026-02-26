package leetcodecontest.weekly.Four48;


class OddThread implements Runnable {
    private final NumberPrinter np;

    public OddThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printOdd();
    }
}

class EvenThread implements Runnable {
    private final NumberPrinter np;

    public EvenThread(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printEven();
    }
}

public class Example {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter(10);

        Thread t1 = new Thread(() -> np.printOdd());
        Thread t2 = new Thread(new EvenThread(np));

        t1.start();
        t2.start();
    }
}

class NumberPrinter {
    private final int max;
    private int number = 1;

    public NumberPrinter(int max) {
        this.max = max;
    }

    public synchronized void printOdd() {
        while (number < max) {
            while (number % 2 == 0) { // wait if number is even
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Odd: " + number);
            number++;
            notify(); // wake up the even thread
        }
    }

    public synchronized void printEven() {
        while (number <= max) {
            while (number % 2 != 0) { // wait if number is odd
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Even: " + number);
            number++;
            notify(); // wake up the odd thread
        }
    }

}

