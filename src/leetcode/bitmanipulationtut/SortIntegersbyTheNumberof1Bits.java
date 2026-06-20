package leetcode.bitmanipulationtut;

import java.util.*;

public class SortIntegersbyTheNumberof1Bits {

    public static void main(String[] args) {

        int[] arr = {10000, 10000};
        System.out.println(Arrays.toString(new SortIntegersbyTheNumberof1Bits().sortByBits(arr)));

    }

    public int[] sortByBits(int[] arr) {

        Integer[] nums = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }

        Arrays.sort(nums, new CustomSortIntegerTheNumberOf1Bits());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = nums[i];
        }

        return arr;
    }


    int numberOfOnesInBinaryRepresentation(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num >>= 1;
        }

        return count;
    }

}

class CustomSortIntegerTheNumberOf1Bits implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        int numberOf1BitsIna = new SortIntegersbyTheNumberof1Bits().numberOfOnesInBinaryRepresentation(a);
        int numberOf1BitsInb = new SortIntegersbyTheNumberof1Bits().numberOfOnesInBinaryRepresentation(b);

        if (numberOf1BitsIna != numberOf1BitsInb) {
            return numberOf1BitsIna - numberOf1BitsInb;
        }

        return a - b;
    }

}