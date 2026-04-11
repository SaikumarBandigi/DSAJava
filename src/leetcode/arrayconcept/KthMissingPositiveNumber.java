package leetcode.arrayconcept;

public class KthMissingPositiveNumber {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int k = 2;

        System.out.println(new KthMissingPositiveNumber().findKthPositive(arr, k));

    }

    public int findKthPositive(int[] arr, int k) {
        int num = 1;  // start checking from 1
        int i = 0;    // pointer for array  // 2

        while (true) {
            // If current number is in array, move array pointer
            if (i < arr.length && arr[i] == num) {
                i++;
            } else {
                // number is missing
                k--; // 1
                if (k == 0) {
                    return num;
                }
            }
            num++;
        }
    }

}
