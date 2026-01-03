package chatgpt.arrayTUT;

import java.util.HashSet;
import java.util.Set;

public class FifthLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(findFifthLargestEl(arr));
    }

    static int findFifthLargestEl(int[] arr) {
        // If array has fewer than 5 elements, return an error or handle gracefully
        if (arr.length < 5) {
            throw new IllegalArgumentException("Array must contain at least 5 elements");
        }

        // Variables to store the five largest unique values
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int fourth = Integer.MIN_VALUE;
        int fifth = Integer.MIN_VALUE;

        // Set to track unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        for (int num : arr) {
            // Skip duplicate values
            if (!uniqueElements.add(num)) {
                continue;
            }

            if (num > first) {
                fifth = fourth;
                fourth = third;
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                fifth = fourth;
                fourth = third;
                third = second;
                second = num;
            } else if (num > third) {
                fifth = fourth;
                fourth = third;
                third = num;
            } else if (num > fourth) {
                fifth = fourth;
                fourth = num;
            } else if (num > fifth) {
                fifth = num;
            }
        }

        // Check if fifth element was updated
        if (fifth == Integer.MIN_VALUE) {
            throw new RuntimeException("No Fifth Largest Element");
        }

        return fifth;
    }
}
