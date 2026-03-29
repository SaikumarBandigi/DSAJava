package leetcode.HeapPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {

        int[] nums = {2, 7, 4, 1, 8, 1};
        System.out.println(new LastStoneWeight().lastStoneWeight(nums));

    }

    public int lastStoneWeight(int[] stones) {
        // Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new CustomComparator());

        // Add all stones
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        // Process until one stone left
        while (maxHeap.size() > 1) {
            int first = maxHeap.poll();   // first largest
            int second = maxHeap.poll();  // second largest

            if (first != second) {
                maxHeap.add(first - second);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }

}

class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }

}