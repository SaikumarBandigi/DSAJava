package chatgpt.arrayTUT;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(findThirdLargestEl(arr)); // Correct method name
    }

    static int findThirdLargestEl(int[] arr) { // Correct method name
        if (arr == null || arr.length < 3) {
            throw new IllegalArgumentException("Array must have at least 3 distinct elements.");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        if (third == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array does not have a valid third largest element.");
        }

        return third;
    }

}
