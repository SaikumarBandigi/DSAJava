package leetcode.leetcode75.queue;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    private Queue<Integer> queue;

    // Constructor to initialize the RecentCounter
    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // Add the current request time to the queue
        queue.add(t);

        // Remove requests that are outside the 3000 ms range
        while (!queue.isEmpty() && queue.peek() < t - 3000) {
            queue.poll();
        }

        // Return the size of the queue, which represents the number of requests in the range
        return queue.size();
    }

    public static void main(String[] args) {

        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));     // Output: 1
        System.out.println(recentCounter.ping(100));   // Output: 2
        System.out.println(recentCounter.ping(3001));  // Output: 3
        System.out.println(recentCounter.ping(3002));  // Output: 3

    }
}
