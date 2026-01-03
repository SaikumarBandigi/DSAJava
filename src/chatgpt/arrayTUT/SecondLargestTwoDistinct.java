package chatgpt.arrayTUT;

public class SecondLargestTwoDistinct {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7};


        // Check if the array has at least two distinct elements
        if (arr.length < 2) {
            System.out.println("Array must have at least two distinct elements.");
            return;
        }

        // Initialize variables to hold the largest and second largest elements
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the array
        for (int num : arr) {
            if (num > largest) {
                // Update second largest before updating the largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                // Update second largest only if it's less than the current number
                secondLargest = num;
            }
        }

        // Check if a second largest value was found
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements may be equal).");
        } else {
            System.out.println("The second largest element is " + secondLargest + ".");
        }
    }

}
