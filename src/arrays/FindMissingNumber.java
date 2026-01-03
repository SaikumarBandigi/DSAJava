package arrays;

public class FindMissingNumber {
    public static int findMissingNumber(int[] arr) {
        int n = arr.length;
        // Assuming the sequence starts from the first element of the array
        int step = arr[1] - arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] != step) {
                // If the difference between consecutive elements is not equal to the step,
                // the missing number lies between arr[i-1] and arr[i]
                return arr[i - 1] + step;
            }
        }
        return Integer.MIN_VALUE; // If no missing number found
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 0, -2, -3};
        int missingNumber = findMissingNumber(arr);
        if (missingNumber != Integer.MIN_VALUE) {
            System.out.println("The missing number is: " + missingNumber);
        } else {
            System.out.println("No missing number found.");
        }
    }


}
