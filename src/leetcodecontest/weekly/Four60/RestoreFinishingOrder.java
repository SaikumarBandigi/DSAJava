package leetcodecontest.weekly.Four60;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RestoreFinishingOrder {
    public static void main(String[] args) {
        int[] order = {1, 4, 5, 3, 2};
        int[] friends = {2, 5};
        System.out.println(Arrays.toString(recoverOrder(order, friends)));
    }

    public static int[] recoverOrder(int[] order, int[] friends) {

        // Put friends in a set for quick lookup
        Set<Integer> setFriends = new LinkedHashSet<>();
        for (int num : friends) {
            setFriends.add(num);
        }

        // Collect only friends from order in the same sequence
        int[] temp = new int[order.length];
        int idx = 0;
        for (int num : order) {
            if (setFriends.contains(num)) {
                temp[idx++] = num;
            }
        }

        // Manual copy to result array of correct size
        int[] result = new int[idx];
        System.arraycopy(temp, 0, result, 0, idx);
        return result;

    }
}
