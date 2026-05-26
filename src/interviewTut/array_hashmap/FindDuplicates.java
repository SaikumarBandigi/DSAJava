package interviewTut.array_hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.ToIntFunction;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1};
        System.out.println(Arrays.toString(new FindDuplicates().findDuplicates(arr)));
    }

    int[] findDuplicates(int[] nums) {

        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                set2.add(num);
            }
        }


        return set2.stream().mapToInt(x -> x).toArray();
    }

}
