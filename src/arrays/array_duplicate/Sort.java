package arrays.array_duplicate;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 1, 2};
        findDuplicate(a);

    }

    private static void findDuplicate(int[] a) {

        Arrays.sort(a);

        for (int i = 1; i < a.length; i++) {

            if (a[i] == a[i - 1]) {
                System.out.println(a[i]);
            }
        }

    }
}
