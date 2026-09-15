package sept.arrayTut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public static void main(String[] args) {

        int[][] intervals = {
                {1, 3},
                {2, 5},
                {7, 9},
                {8, 11}
        };

        int[][] res = new MergeIntervals().merge(intervals);
        for (int[] interval : res) {
            System.out.println(Arrays.toString(interval));
        }
    }

    int[][] merge(int[][] intervals) {

        // If there is 0 or 1 interval, nothing to merge
        if (intervals.length <= 1) {
            return intervals;
        }

        // Sort intervals by starting value
        Arrays.sort(intervals, new IntervalComparator());

        List<int[]> result = new ArrayList<>();

        // Start with the first interval
        int[] oldInterval = intervals[0];
        result.add(oldInterval);

// Start from the second interval
        for (int i = 1; i < intervals.length; i++) {
            int[] newInterval = intervals[i];
            // Check overlap
            if (newInterval[0] <= oldInterval[1]) {
                // Merge intervals
                oldInterval[1] = Math.max(oldInterval[1], newInterval[1]);
            } else {
                // No overlap
                oldInterval = newInterval;
                result.add(oldInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }

}


class IntervalComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
        // Sort based on starting value
        return Integer.compare(a[0], b[0]);
    }
}
