package arrays;

public class SecondHighestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        System.out.println(secondHighestElement(arr, highest, secondHighest));
    }

    static int secondHighestElement(int[] arr, int firstHighest, int secondHighest) {
        for (int num : arr) {
            if (num > firstHighest) {
                secondHighest = firstHighest; // Update second firstHighest
                firstHighest = num;           // Update firstHighest
            } else if (num > secondHighest && num != firstHighest) {
                secondHighest = num;     // Update second firstHighest
            }
        }
        return secondHighest;
    }
}

