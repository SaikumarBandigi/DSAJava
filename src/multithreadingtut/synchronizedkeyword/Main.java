package multithreadingtut.synchronizedkeyword;

public class Main {

    int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }


    public static void main(String[] args) {

        Main obj = new Main();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(obj.getCount());


    }
}
