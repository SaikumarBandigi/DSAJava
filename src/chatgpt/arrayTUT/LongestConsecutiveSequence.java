package chatgpt.arrayTUT;

import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 8};
        ArrayList<Integer> res = get(arr);
        System.out.println(res);
        System.out.println(res.size());
    }

    private static ArrayList<Integer> get(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        ArrayList<Integer> longestSequence = new ArrayList<>();
        int longestLength = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int currentNum = num;

                ArrayList<Integer> currentSequence = new ArrayList<>();
                while (set.contains(currentNum)) {
                    currentSequence.add(currentNum);
                    currentNum += 1;
                }

                if (currentSequence.size() > longestLength) {
                    longestLength = currentSequence.size();
                    longestSequence = currentSequence;
                }

            }
        }

        return longestSequence;
    }
}
