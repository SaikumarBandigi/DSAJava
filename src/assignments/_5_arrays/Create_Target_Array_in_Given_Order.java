package assignments._5_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_in_Given_Order {
    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 3, 4};
       // int[] index = {0, 1, 2, 2, 1};

//        int[] res = createTargetArray(nums, index);
//        System.out.println(Arrays.toString(res));

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int[] ans = new int[nums.length];

//        for (int i = 0; i < nums.length; i++) {
//            arr.add(index[i], nums[i]);
//        }
        arr.add(0, 0);
        arr.add(1, 1);
        arr.add(2, 2);
        arr.add(2, 3);
        arr.add(1, 4);

        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        System.out.println(Arrays.toString(ans));

    }

    public static int[] createTargetArray(int[] nums, int[] index) {

//        int[] target = new int[index.length];
//
//        for (int i = 0; i < index.length; i++) {
//            for (int j = i; j > index[i]; j--) {
//                target[j] = target[j - 1];
//            }
//            target[index[i]] = nums[i];
//        }
//        return target;

        // or //

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }

        return ans;
    }
}
