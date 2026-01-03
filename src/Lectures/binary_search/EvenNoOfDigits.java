package Lectures.binary_search;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 1, 22, 33};
        System.out.println(findEvenDigits(nums));
    }

    private static int findEvenDigits(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                count++;
            }

            if (count % 2 == 0) {
                c++;
            }
        }
        return c;
    }
}


/*
class Solution {
     int findNumbers(int[] nums) {

        int count = 0;

        for (int i : nums) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

      boolean even(int i) {

        int numberofdigits = digits(i);

         return numberofdigits % 2 == 0;
     }

       int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) - 1;
    }

}
 */