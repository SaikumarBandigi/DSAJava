package stackTut;

public class ImplStackUsingArray {
    public static void main(String[] args) {

        StackSai stackSai = new StackSai(); // LIFO
        stackSai.push(2);
        stackSai.push(3);

        System.out.println(stackSai.pop());

    }
}

class StackSai {

    private final int[] size;
    private final static int DEFAULT_SIZE = 10;

    public StackSai() {
        this(DEFAULT_SIZE);
    }

    public StackSai(int addSize) {
        this.size = new int[addSize];
    }

    private int index = -1;


    boolean push(int num) {
        if (isFull()) {
            System.out.println();
        }
        index++;
        size[index] = num;
        return true;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println();
        }
        return size[index--];
    }

    int peek() {
        return size[index];
    }

    private boolean isFull() {
        return index == size.length - 1;
    }

    private boolean isEmpty() {
        return index == -1;
    }


}