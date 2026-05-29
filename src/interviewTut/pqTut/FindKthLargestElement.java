package interviewTut.pqTut;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargestElement {

    public static void main(String[] args) {

        int[] arr = {3, 2, 1, 7, 9, 8};
        int k = 1;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : arr) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        System.out.println(pq.peek());

    }

}
