package Lectures._linear_search_algorithm;

public class FindMin {
    public static void main(String[] args) {

//        int a[] = {11, 2, 3, 4, -1, 7, 8};
//
//        int ans = findMin(a);
//
//        System.out.println(ans);


        int arr[] = {2, 1, 5, 6, 7, 8, -41, -2};


        int result = findMinValue(arr);
        System.out.println(result);

    }

    private static int findMinValue(int[] arr) {

        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }

        int element = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < element) {
                element = arr[i];
            }
        }

            return element;
    }

//    private static int findMin(int[] a) {
//        int element = a[0];
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] < element) {
//                element=a[i];
//            }
//        }
//        return element;
//    }
}
