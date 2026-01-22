package leetcode.stackConcept;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q2.offer(x);          // Step 1: add to q2
        while (!q1.isEmpty()) {
            q2.offer(q1.poll()); // Step 2: move all from q1 to q2
        }
        // Step 3: swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        return q1.poll();  // front of q1 is top of stack
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}


public class ImplementStackUsingQueues {
    public static void main(String[] args) {

    }

}
