package chatgpt.arrayTUT;

public class FindMaximumProductOfTwoIntegersInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2};  // Example input

        int maxProduct = findMaxProduct(arr);

        System.out.println("The maximum product is " + maxProduct + ".");
    }

    // Function to find the maximum product of two integers in the array
    public static int findMaxProduct(int[] arr) {
        // Initialize variables to track the two largest and two smallest elements
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        // Traverse the array
        for (int num : arr) {
            // Update the two largest elements
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }

            // Update the two smallest elements
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // The maximum product will be the larger of the product of the two largest elements
        // or the product of the two smallest elements (if both are negative)
        return Math.max(max1 * max2, min1 * min2);
    }
}
