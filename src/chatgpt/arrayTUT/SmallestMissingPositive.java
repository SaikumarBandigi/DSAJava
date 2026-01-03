package chatgpt.arrayTUT;
/*

Constraints:
The array can contain negative numbers and zeros.
Your solution should work in O(n) time complexity.

Hint:
The smallest missing positive integer will always lie between 1 and n+1, where n is the size of the array.
You might need to manipulate the array itself to achieve O(n) time complexity.

 */
public class SmallestMissingPositive {
    public static int findSmallestMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Place each positive integer in its correct position
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                // Swap arr[i] with arr[arr[i] - 1]
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Step 2: Find the first index where arr[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1; // Smallest missing positive integer
            }
        }

        // If all indices are correct, return n + 1
        return n + 1;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        int[] arr1 = {3, 4, -1, 1};
        System.out.println(findSmallestMissingPositive(arr1)); // Output: 2

        int[] arr2 = {1, 2, 0};
        System.out.println(findSmallestMissingPositive(arr2)); // Output: 3

        int[] arr3 = {7, 8, 9, 11, 12};
        System.out.println(findSmallestMissingPositive(arr3)); // Output: 1

        int[] arr4 = {-5, -10, -3};
        System.out.println(findSmallestMissingPositive(arr4)); // Output: 1
    }
}
