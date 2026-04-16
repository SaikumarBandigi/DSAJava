package leetcode.stringconcept;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    public static void main(String[] args) {

        int[] nums = {5, 2, 9, 1};
        System.out.println(new LargestNumber().largestNumber(nums));

    }

    public String largestNumber(int[] nums) {

        // Convert integers to strings
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort using custom comparator
        Arrays.sort(arr, new CustomComparator());

        // Edge case: if highest value is "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build the result
        StringBuilder result = new StringBuilder();
        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }

}


class CustomComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) { // a=5  b=2
        return (b + a).compareTo(a + b);  // 25.compareTo(52)  -> negative so a comes before b -> 5 comes before 2
    }

}