package chatgpt.arrayTUT;

import java.util.HashSet;

public class FindAllPairsWithGivenSumInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int target = 4;

        findPairs(arr, target);
    }

    // Function to find all pairs that sum up to the target value
    public static void findPairs(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println(complement+" "+num);
            }
            set.add(num);
        }
    }
}
