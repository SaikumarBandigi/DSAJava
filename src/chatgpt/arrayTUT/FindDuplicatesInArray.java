package chatgpt.arrayTUT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] arr2 = {1, 1, 2};
        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println(getDuplicatesFromArray(arr1)); // Output: [2, 3]
        System.out.println(getDuplicatesFromArray(arr2)); // Output: [1]
        System.out.println(getDuplicatesFromArray(arr3)); // Output: []
    }

    private static List<Integer> getDuplicatesFromArray(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                list.add(num);
            }
        }
        return list;
    }
}
