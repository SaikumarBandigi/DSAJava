package interviewTut.slidingwindowTut;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeNumberinEveryWindowofSizeK {

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        new FirstNegativeNumberinEveryWindowofSizeK().firstNegativeFirstWindowThenSlide(arr, k);
    }

    void firstNegativeFirstWindowThenSlide(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.offer(i);
            }
        }

        System.out.print(q.isEmpty() ? "0 " : arr[q.peek()] + " ");

        for (int i = k; i < arr.length; i++) {

            while (!q.isEmpty() && q.peek() <= i - k) {
                q.poll();
            }

            if (arr[i] < 0) {
                q.offer(i);
            }

            System.out.print(q.isEmpty() ? "0 " : arr[q.peek()] + " ");
        }

    }


}
