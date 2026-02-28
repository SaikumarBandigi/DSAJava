package leetcode.HeapPriorityQueue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        // Max Heap (Descending order of score)
        PriorityQueue<int[]> pq = new PriorityQueue<>(new MaxHeapDescending());

        // Store score and index
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{score[i], i});
        }

        int rank = 1;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int index = current[1];

            switch (rank) {
                case 1 -> result[index] = "Gold Medal";
                case 2 -> result[index] = "Silver Medal";
                case 3 -> result[index] = "Bronze Medal";
                default -> result[index] = String.valueOf(rank);
            }

            rank++;
        }

        return result;
    }
}

class MaxHeapDescending implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        return o2[0] - o1[0];
    }
}
