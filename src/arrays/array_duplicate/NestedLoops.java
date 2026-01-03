package arrays.array_duplicate;

public class NestedLoops {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 1, 2, 6};
        findDuplicatesUsingNestedLoops(a);
    }

    public static void findDuplicatesUsingNestedLoops(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }


    }
}
