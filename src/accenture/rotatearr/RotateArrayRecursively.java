package accenture.rotatearr;
// Recursive Approach
public class RotateArrayRecursively {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int rotations = 2; // Number of rotations

        System.out.println("Original Array: " + arrayToString(originalArray));

        // Rotate the array to the right recursively
        rotateRightRecursive(originalArray, rotations);

        System.out.println("Array after " + rotations + " rotations to the right: " + arrayToString(originalArray));
    }

    // Helper method to rotate an array to the right recursively
    private static void rotateRightRecursive(int[] array, int rotations) {
        if (rotations <= 0) {
            return; // Base case: no need to rotate further
        }

        // Perform one rotation to the right
        int lastElement = array[array.length - 1];
        shiftRight(array, array.length - 1);
        array[0] = lastElement;

        // Recursively rotate the remaining rotations
        rotateRightRecursive(array, rotations - 1);
    }

    // Helper method to shift elements to the right
    private static void shiftRight(int[] array, int index) {
        if (index > 0) {
            array[index] = array[index - 1];
            shiftRight(array, index - 1);
        }
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

/*
how many ways array in java are rotated

ChatGPT
When you rotate an array, you essentially shift its elements to the left or right. The number of unique ways to rotate an array depends
on the length of the array. For an array of length n, there are n distinct ways to rotate it.

Let's take a simple example to illustrate this. Consider the array {1, 2, 3, 4}:

Rotate by 1 to the right: {4, 1, 2, 3}
Rotate by 2 to the right: {3, 4, 1, 2}
Rotate by 3 to the right: {2, 3, 4, 1}
Rotate by 4 to the right: {1, 2, 3, 4} (back to the original array)
Similarly, you can rotate the array to the left by any number of positions.

So, for an array of length n, you have n distinct ways to rotate it, including the case where you don't rotate it at all (0 rotations)
 and the case where you rotate it by the array's length (which brings you back to the original array).




User
how many different approches are there to rotate an array
ChatGPT
There are several approaches to rotate an array in Java. Here are some common methods:

Using Temporary Array:

Create a temporary array to store rotated elements.
Copy elements from the original array to the temporary array with the new index after rotation.
Copy elements back to the original array.
Using Reversal:

Reverse the entire array.
Reverse the first k elements (where k is the number of rotations).
Reverse the remaining elements.
Rotate One-by-One:

Perform one rotation at a time, shifting elements to the right or left.
Juggling Algorithm:

Divide the array into sets based on the greatest common divisor (GCD) of the array length and the number of rotations.
Rotate each set independently.
Block Swap Algorithm:

Divide the array into two blocks: A and B.
Swap A and B.
Recursively swap the remaining blocks.
Using ArrayList:

Convert the array to an ArrayList for easy rotation using Collections.rotate() method.
Using Cyclic Replacements:

Perform cyclic replacements of elements within cycles.
Recursive Approach:

Rotate the array recursively by performing one rotation at a time.
Using LinkedList:

Convert the array to a linked list and perform rotations by updating the links.
The choice of method depends on the specific requirements, constraints, and preferences. Some methods are more suitable for certain scenarios,
such as minimizing space complexity, optimizing for time complexity, or handling specific rotation patterns efficiently.
 */