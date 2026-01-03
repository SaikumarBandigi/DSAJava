package chatgpt.arrayTUT;

public class FindUniqueSecondLargestElement {

    public static void main(String[] args) {
        int[] arr1 = {4, 4, 4};
        int[] arr2 = {12, 35, 1, 10, 34, 1};
        int[] arr3 = {10, 5, 10};
        int[] arr4 = {10};
        int[] arr5 = {3, 1, 2};

        System.out.println(secondLargestUnique(arr1)); // Output: -1
        System.out.println(secondLargestUnique(arr2)); // Output: 34
        System.out.println(secondLargestUnique(arr3)); // Output: 5
        System.out.println(secondLargestUnique(arr4)); // Output: -1
        System.out.println(secondLargestUnique(arr5)); // output: 2
    }

    static int secondLargestUnique(int[] arr) {

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num < firstLargest) {
                secondLargest = num;
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

}
