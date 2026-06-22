package interviewTut.slidingwindowTut;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDistinctElementsinEveryWindowofSizeK {

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        countDistinctFirstWindowThenSlide(arr, k);

        //  1 2 1 3 -> 3 // this is first window

        // 2 1 3 4 -> 4
        // 1 3 4 2 -> 4
        // 3 4 2 3 -> 3

        System.out.println();


        countDistinctSingleSlidingWindow(arr, k);

    }

    //For Count Distinct Elements, the same sliding idea applies,
    // but we can't simply remove and add values because we need to know whether an element is still present elsewhere in the window.

    public static void countDistinctFirstWindowThenSlide(int[] arr, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.print(map.size() + " ");  // number of keys

        for (int i = k; i < arr.length; i++) {  // index 4 to 6

            int left = arr[i - k];
            int right = arr[i];

            map.put(left, map.get(left) - 1);  // reduce left frequency
            if (map.get(left) == 0) {
                map.remove(left);
            }

            map.put(right, map.getOrDefault(right, 0) + 1); //add right element

            System.out.print(map.size() + " ");
        }
    }


    public static void countDistinctSingleSlidingWindow(int[] arr, int k) {

        int i = 0, j = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (j < arr.length) {

            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            if (j - i + 1 < k) {
                j++;
            } else {

                System.out.print(map.size() + " ");

                map.put(arr[i], map.get(arr[i]) - 1);

                if (map.get(arr[i]) == 0) {
                    map.remove(arr[i]);
                }

                i++;
                j++;
            }
        }
    }

}
