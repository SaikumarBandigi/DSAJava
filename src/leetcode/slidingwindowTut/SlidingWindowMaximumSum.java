package leetcode.slidingwindowTut;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximumSum {
    public static void main(String[] args) {

        int[] nums = {1, 3, -1, -3};
        int k = 3;

        System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>(); // stores indices

        for (int i = 0; i < n; i++) {
            // Remove indices out of the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Remove all indices whose values are less than nums[i]
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current index to deque
            deque.offerLast(i);

            // Window has hit size k, record the max
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }


}
