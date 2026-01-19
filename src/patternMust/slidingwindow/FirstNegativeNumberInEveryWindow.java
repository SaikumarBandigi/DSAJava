package patternMust.slidingwindow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegativeNumberInEveryWindow {
    public static void main(String[] args) {

        int[] arr = {-8, 2, 3, -6, 10};
        int k = 2;

        System.out.println(firstNegativeInEveryWindowBruteForce(arr, k));
    }

    static List<Integer>
    firstNegativeInEveryWindowBruteForce(int[] arr, int k) {

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i <= arr.length - k; i++) {
            int firstNegative = 0;
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0) {
                    firstNegative = arr[j];
                    break;
                }
            }
            list.add(firstNegative);
        }

        return list;
    }

    public static List<Integer> firstNegativeInEveryWindow(int[] arr, int k) {

        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        int i = 0;

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] < 0) {
                queue.offer(arr[j]);
            }

            if (j - i + 1 == k) {

                result.add(queue.isEmpty() ? 0 : queue.peek());

                if (!queue.isEmpty() && arr[i] == queue.peek()) {
                    queue.poll();
                }

                i++; // slide window
            }
        }

        return result;
    }

}
