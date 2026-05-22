package interviewTut;

public class FindLargestElementInArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(new FindLargestElementInArray().max(arr));

    }

    int max(int[] arr) {
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

}
