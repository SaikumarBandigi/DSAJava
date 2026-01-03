package leetcode.other;
public class FindEvenoOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 78968};

        int answer = Find(nums);
        System.out.println(answer);
    }
    private static int Find(int[] nums) {

        int count = 0;

        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    private static boolean even(int num) {
        int numberofdigits = digits(num);

        if (numberofdigits % 2 == 0) {
            return true;
        }
        return false;
    }
    static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // or //

//    static int digit(int num) {
//        if (num < 0) {
//            num = num * -1;
//        }
//        return (int) (Math.log10(num)) - 1;
//    }

}
