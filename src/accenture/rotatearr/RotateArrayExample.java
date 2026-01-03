package accenture.rotatearr;
// Temporary Array
public class RotateArrayExample {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int rotations = 2; // Number of rotations

        System.out.println("Original Array: " + arrayToString(originalArray));

        // Rotate the array to the right
        rotateRight(originalArray, rotations);

        System.out.println("Array after " + rotations + " rotations to the right: " + arrayToString(originalArray));
    }

    // Helper method to rotate an array to the right
    private static void rotateRight(int[] array, int rotations) {
        int length = array.length;
        rotations = rotations % length; // Handle cases where rotations are greater than array length

        // Create a temporary array to store rotated elements
        int[] temp = new int[length];

        // Copy elements to the temporary array with the new index after rotation
        for (int i = 0; i < length; i++) {
            temp[(i + rotations) % length] = array[i];
        }

        // Copy elements back to the original array
        System.arraycopy(temp, 0, array, 0, length);
/* manual copy
       for(int i=0;i<length;i++)
       {
       array[i]=temp[i];
       }
  */
    }

    // Helper method to convert an array to a string for printing
    private static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
