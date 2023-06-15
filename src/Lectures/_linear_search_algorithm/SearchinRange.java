package Lectures._linear_search_algorithm;

public class SearchinRange {
    public static void main(String[] args) {

        int a[] = {18, 12, -7, 3, 14, 28};

        int first = 1;
        int last = 3;
        int target = -7;

        int aa = search(a, first, last, target);

        System.out.println(aa);
    }

    static int search(int[] a, int start, int end, int target) {


        if (a.length == 0)
            return -1;


        for (int index = start; index <= end; index++) {
            int element = a[index];

            if (element == target) {
                return index;
            }

        }

        return -1;
    }

}
