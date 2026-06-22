package interviewBit;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;



        System.out.println(Arrays.toString(new Main().get(arr, target)));
    }

    int[] get(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

}
