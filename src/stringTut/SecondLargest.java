package stringTut;

import java.util.ArrayList;
import java.util.List;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println(findSecondLargest(list));
    }

    public static int findSecondLargest(List<Integer> arr) {
        if (arr.size() < 2) return -1;
        int firstlargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstlargest) {
                secondLargest = firstlargest;
                firstlargest = num;
            } else if (num > secondLargest && num < firstlargest) {
                secondLargest = num;
            }
        }
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}
