package leetcode.arrayconcept;

import java.util.Deque;
import java.util.LinkedList;

public class TrappingRainWaterMonotonicStack {
    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height));
    }

    public static int trap(int[] height) {
        int n = height.length;
        if (n <= 2) {
            return 0;
        }

        int trapped = 0;
        int i = 0, min = height[0], max = height[0];

        Deque<int[]> stack = new LinkedList<>();
        stack.add(new int[]{0, max});

        for (i = 1; i < n; i++) {
            int h = height[i];

            if (h < min) {
                if (h != 0) stack.add(new int[]{i, h});
                min = h;
                continue;
            }

            while (!stack.isEmpty() && min < h) {
                int[] last = stack.getLast();
                int w = i - last[0] - 1;

                if (min < last[1]) {
                    int minH = Math.min(last[1], h);
                    trapped += (minH - min) * w;
                    min = minH;
                }

                if (last[1] <= min)
                    stack.removeLast();
            }

            stack.add(new int[]{i, h});
        }

        return trapped;
    }

}
