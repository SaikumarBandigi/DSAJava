package chatgpt.arrayTUT;

public class FourthLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        try {
            System.out.println("The fourth largest element is: " + findFourthLargest(arr));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static int findFourthLargest(int[] arr) {
        if (arr == null || arr.length < 4) {
            throw new IllegalArgumentException("Array must have at least 4 distinct elements.");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        int fourth = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                fourth = third;
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                fourth = third;
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                fourth = third;
                third = num;
            } else if (num > fourth && num != third && num != second && num != first) {
                fourth = num;
            }
        }

        if (fourth == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array does not have a valid fourth largest element.");
        }

        return fourth;
    }
}
