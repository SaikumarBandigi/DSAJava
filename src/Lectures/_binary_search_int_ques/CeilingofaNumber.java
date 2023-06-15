package Lectures._binary_search_int_ques;

// smallest number of which is greater or equal to the target
public class CeilingofaNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 10, 13};
        int target = 12;
        int answer = findCeiling(a, target);
        int res = a[answer];
        System.out.println(res);
    }

    private static int findCeiling(int[] a, int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == a[mid]) {
                return mid;
            } else if (target < a[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
