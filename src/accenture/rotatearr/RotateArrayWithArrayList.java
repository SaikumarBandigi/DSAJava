package accenture.rotatearr;

import java.util.ArrayList;
import java.util.Collections;

// ArrayList Approach
public class RotateArrayWithArrayList {
    public static void main(String[] args) {
        // Original array
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);

        int rotations = 4; // Number of rotations

        System.out.println("Original Array: " + originalList);

        // Rotate the array to the right using ArrayList
        rotateRight(originalList, rotations);

        System.out.println("Array after " + rotations + " rotations to the right: " + originalList);
    }

    // Helper method to rotate an ArrayList to the right
    private static void rotateRight(ArrayList<Integer> list, int rotations) {
        int size = list.size();
        rotations = rotations % size; // Handle cases where rotations are greater than the list size

        // Use Collections.rotate() to rotate the list
        Collections.rotate(list, rotations);
    }
}
