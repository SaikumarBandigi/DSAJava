package leetcode.bitmanipulationtut;

public class Example {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            Thread thread = new Thread(new MyThread());
            thread.start();
        }

    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Task Running: " + Thread.currentThread().getName());
    }
}