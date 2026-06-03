package leetcode.MathTut;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {


    public static void main(String[] args) {

        int left = 1;
        int right = 22;

        System.out.println(new SelfDividingNumbers().selfDividingNumbers(left, right));
    }

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                list.add(i);
            }
        }
        return list;
    }

    boolean isSelfDividing(int num) {

        String s = String.valueOf(num);

        int[] arr = new int[s.length()];  // 128

        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i) - '0';
        }

        for (int i = 0; i < arr.length; i++) {
            int digit = arr[i];

            if (digit == 0 || num % digit != 0) {
                return false;
            }
        }

        return true;
    }

}
