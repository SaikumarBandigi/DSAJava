package interviewTut.array_hashmap;

import java.util.PriorityQueue;

public class Example {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq);      // not sorted output
        System.out.println(pq.peek()); // 10

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }

}
