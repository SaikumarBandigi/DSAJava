package arrays;

public class FirstHighestNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(firstMaximumNumber(arr));
    }

    static int firstMaximumNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

}
