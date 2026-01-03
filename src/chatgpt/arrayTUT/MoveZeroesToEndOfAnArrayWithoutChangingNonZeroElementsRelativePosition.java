package chatgpt.arrayTUT;

public class MoveZeroesToEndOfAnArrayWithoutChangingNonZeroElementsRelativePosition {
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 0, 2, 5, 0};

        System.out.println("Original Array:");
        printArray(arr);

        moveZeroes(arr);

        System.out.println("Array after moving zeroes:");
        printArray(arr);
    }

    // Function to move all zeroes to the end of the array
    public static void moveZeroes(int[] arr) {
        int n = arr.length - 1;
        int nonZeroMoves = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonZeroMoves];
                arr[nonZeroMoves] = temp;
                nonZeroMoves++;
            }
        }

    }

    // Helper function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
