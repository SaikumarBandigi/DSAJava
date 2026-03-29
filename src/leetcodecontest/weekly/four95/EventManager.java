package leetcodecontest.weekly.four95;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class EventManager {

    private PriorityQueue<int[]> maxHeap;
    private Map<Integer, Integer> map;

    public EventManager(int[][] events) {
        map = new HashMap<>();

        maxHeap = new PriorityQueue<>(new CustomComparator());

        for (int[] event : events) {
            int id = event[0];
            int priority = event[1];
            map.put(id, priority);
            maxHeap.offer(new int[]{id, priority});
        }
    }

    public void updatePriority(int eventId, int newPriority) {
        map.put(eventId, newPriority);
        maxHeap.offer(new int[]{eventId, newPriority}); // push updated value
    }

    public int pollHighest() {
        while (!maxHeap.isEmpty()) {
            int[] top = maxHeap.poll();
            int id = top[0];
            int priority = top[1];

            // check if it's the latest valid entry
            if (map.containsKey(id) && map.get(id) == priority) {
                map.remove(id); // mark as removed
                return id;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}

class CustomComparator implements Comparator<int[]> {

    @Override
    public int compare(int[] a, int[] b) {
        if (b[1] != a[1]) {
            return b[1] - a[1]; // higher priority first
        }
        return a[0] - b[0]; // smaller eventId first
    }
}
