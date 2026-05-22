package leetcode.arrayconcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparatetheDigitsinanArray {

    public static void main(String[] args) {
        int[] nums = {13, 25, 83, 77};
        System.out.println(Arrays.toString(new SeparatetheDigitsinanArray().separateDigits(nums)));
    }

    public static int[] separateDigits(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {
            String s = String.valueOf(num);

            for (char ch : s.toCharArray()) {
                list.add(ch - '0');
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
