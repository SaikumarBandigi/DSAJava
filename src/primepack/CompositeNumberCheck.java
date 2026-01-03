package primepack;

import java.util.ArrayList;

public class CompositeNumberCheck {
    public static void main(String[] args) {
        int number = 6;  // 1 2 3 6  more than 2 factors is composite
        System.out.println(isCompositeNumber(number));
    }

    private static boolean isCompositeNumber(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                list.add(i);
            }
        }
        return list.size() > 2;
    }

}
