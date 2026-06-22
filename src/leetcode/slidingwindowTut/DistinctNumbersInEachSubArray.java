package leetcode.slidingwindowTut;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DistinctNumbersInEachSubArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        System.out.println(Arrays.toString(new DistinctNumbersInEachSubArray().getDistinctNumbersInEachWind(arr, k)));

    }

    int[] getDistinctNumbersInEachWind(int[] arr, int k) {

        // 0 0 0 0
        //
        int[] ans = new int[arr.length - k + 1];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ans[0] = map.size();

        for (int i = k; i < arr.length; i++) {

            int left = arr[i - k];
            int right = arr[i];

            map.put(left, map.get(left) - 1);

            if (map.get(left) == 0) {
                map.remove(left);
            }
            map.put(right, map.getOrDefault(right, 0) + 1);

            ans[i - k + 1] = map.size();
        }

        return ans;

    }

}
/*

Related sliding-window problems you should practice next:

LeetCode 643. Maximum Average Subarray I
LeetCode 239. Sliding Window Maximum
LeetCode 438. Find All Anagrams in a String
LeetCode 567. Permutation in String
LeetCode 992. Subarrays with K Different Integers

 */